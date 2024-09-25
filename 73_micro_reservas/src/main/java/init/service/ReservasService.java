package init.service;

import java.util.List;

import org.springframework.stereotype.Service;

import init.dao.ReservasDao;
import init.entities.Reserva;
import init.entities.Vuelo;
import init.mapeador.Mapeador;
import init.model.ReservaDto;

@Service
public class ReservasService {

	ReservasDao reservasDao;
	Mapeador mapper;
	
	public ReservasService(ReservasDao reservasDao, Mapeador mapper) {
		super();
		this.reservasDao = reservasDao;
		this.mapper = mapper;
	}
	
	// Alta reserva
	// Condicion: La reserva debe tener plazas en el vuelo
	public boolean alta(ReservaDto reservaDto) {
/*
		Reserva reserva = mapper.dtoToReserva(reservaDto);
		Vuelo vuelo = new Vuelo(reserva.getVuelo().getIdVuelo());
//*/		
//		if (reserva.getVuelo().getIdVuelo())
//		System.out.println("Alta Service ReservaDto: "+reservaDto.getIdReserva());  
//		if (reservasDao.findById(reservaDto.getIdReserva()) == null) {
			reservasDao.save(mapper.dtoToReserva(reservaDto));
			return true;
//		}
//		return false;
	}

	//Lista de reservas por cliente
	public List<ReservaDto> reservas(String usuario){
		System.out.println("Cliente: "+ usuario);
		return reservasDao.findByUsuario(usuario).stream()
				.map(r->mapper.reservaToDto(r))
				.toList();
	}
}
