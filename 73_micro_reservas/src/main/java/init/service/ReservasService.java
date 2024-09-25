package init.service;

import java.util.List;

import init.model.ReservaDto;

public interface ReservasService {

	// Alta reserva
	// Condicion: La reserva debe tener plazas en el vuelo
	boolean alta(ReservaDto reservaDto);

	//Lista de reservas por cliente
	List<ReservaDto> reservas(String usuario);

}