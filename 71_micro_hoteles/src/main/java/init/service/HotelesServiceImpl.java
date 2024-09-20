package init.service;

import java.util.List;
import java.util.Optional;

import init.dao.HotelesDao;
import init.model.HotelDto;
import init.utilidades.Mapeador;

public class HotelesServiceImpl implements HotelesService {
	
	HotelesDao dao;
	Mapeador mapeador;
	
	public HotelesServiceImpl(HotelesDao dao, Mapeador mapeador) {
		super();
		this.dao = dao;
		this.mapeador = mapeador;
	}

	@Override
	public Optional<HotelDto> buscarPorId(int idHotel) {
		return dao.findById(idHotel)
				.map(h->mapeador.HotelEntityToDto(h));
	}

	@Override
	public List<HotelDto> buscarPorLocalizacion(String localizacion) {
		return dao.buscarPorLocalizacion(localizacion)
				;
	}

}
