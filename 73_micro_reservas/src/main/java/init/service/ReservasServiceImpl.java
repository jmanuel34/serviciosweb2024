package init.service;

import java.util.List;

import org.springframework.stereotype.Service;

import init.dao.ReservasDao;
import init.dao.VuelosDao;
import init.entities.Reserva;
import init.entities.Vuelo;
import init.mapeador.Mapeador;
import init.model.ReservaDto;

@Service
public class ReservasServiceImpl implements ReservasService {

	ReservasDao reservasDao;
	VuelosDao vuelosDao;
	Mapeador mapper;
	
	public ReservasServiceImpl(ReservasDao reservasDao, Mapeador mapper, VuelosDao vuelosDao) {
		super();
		this.reservasDao = reservasDao;
		this.mapper = mapper;
		this.vuelosDao = vuelosDao;
	}
	
	// Alta reserva
	// Condicion: La reserva debe tener plazas en el vuelo
	// Ademas debe decrementar las plazas de la reserva
	@Override
	public boolean alta(ReservaDto reservaDto) {
		Reserva reserva = mapper.dtoToReserva(reservaDto);
		// Buscamos el vuelo para el que quiere la reserva
		Vuelo vuelo = reservasDao.findByIdVuelo(reserva.getVuelo().getIdVuelo());
		if (vuelo.getPlazas() > reserva.getVuelo().getPlazas()) {
			reservasDao.save(mapper.dtoToReserva(reservaDto));
			vuelo.setPlazas(vuelo.getPlazas() -reserva.getVuelo().getPlazas());
			vuelosDao.save(vuelo);
			return true;
		}
		return false;
	}

	//Lista de reservas por cliente
	@Override
	public List<ReservaDto> reservas(String usuario){
		System.out.println("Cliente: "+ usuario);
		return reservasDao.findByUsuario(usuario).stream()
				.map(r->mapper.reservaToDto(r))
				.toList();
	}
}
