package init.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import init.dao.VuelosDao;
import init.entities.Vuelo;
import init.model.VueloDto;
import init.utilidades.Mapeador;

@Service
public class VuelosServiceImpl implements VuelosService {

	VuelosDao vuelosDao;
	Mapeador mapper;
	
	public VuelosServiceImpl(VuelosDao vuelosDao, Mapeador mapper) {
		super();
		this.vuelosDao = vuelosDao;
		this.mapper = mapper;
	}
	
//	Actualización de plazas a partir de identificador de vuelo y plazas reservadas
	@Override
	public boolean actualizar(int idVuelo, int plazas) {
		Vuelo vuelo = vuelosDao.findByIdVueloAndPlazasGreaterThan(idVuelo, plazas);
		if (vuelo !=null) {			
			vuelo.setPlazas(plazas);
			vuelosDao.save(vuelo);
			return true;
		}
		return false;
	}
	
//  Datos de Vuelo por identificador
	@Override
	public Optional<VueloDto> findById(int id) {
		return vuelosDao.findById(id)
				.map(v->mapper.VuelosEntityToDto(v));
	}
	
//	Lista de vuelos a partir de un destino y número de plazas
	@Override
	public List<VueloDto> buscarPorDestinoyPlazas (String destino, int plazasLibres){
		return vuelosDao.findByDestinoAndPlazas(destino, plazasLibres)
				.stream()
				.map(v->mapper.VuelosEntityToDto(v))
				.toList();
	}	
	
}
