package init.service;

import java.util.List;
import java.util.Optional;

import init.model.VueloDto;

public interface VuelosService {

	//	Actualización de plazas a partir de identificador de vuelo y plazas reservadas
	boolean actualizar(int idVuelo, int plazas);

	//  Datos de Vuelo por identificador
	Optional<VueloDto> findById(int id);

	//	Lista de vuelos a partir de un destino y número de plazas
	List<VueloDto> buscarPorDestinoyPlazas(String destino, int plazasLibres);

}