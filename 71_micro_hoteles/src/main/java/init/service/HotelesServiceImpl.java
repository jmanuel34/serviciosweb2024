package init.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import init.dao.HotelesDao;
import init.model.HotelDto;
import init.utilidades.Mapeador;

@Service
public class HotelesServiceImpl implements HotelesService {
	
	HotelesDao dao;
	Mapeador mapeador;
	
	public HotelesServiceImpl(HotelesDao dao, Mapeador mapeador) {
		super();
		this.dao = dao;
		this.mapeador = mapeador;
	}

	@Override
	public HotelDto buscarPorId(int idHotel) {
		return dao.findById(idHotel)
				.map(h->mapeador.HotelEntityToDto(h))
				.orElse(null);
	}

	@Override
	public List<HotelDto> buscarPorLocalizacion(String localizacion) {
		return dao.buscarPorLocalizacion(localizacion).stream()
				.map(h->mapeador.HotelEntityToDto(h))
				.toList();
	}

}
