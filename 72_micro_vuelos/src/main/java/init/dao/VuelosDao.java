package init.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Vuelo;

public interface VuelosDao extends JpaRepository<Vuelo, Integer> {
//	Lista de vuelos a partir de un destino y número de plazas
	@Query("select v from Vuelo v where v.idVuelo=?1 and v.plazas>?2")
	List<Vuelo> findByDestinoAndPlazas(String destino, int plazas);
	
//	Actualización de plazas a partir del identificador de vuelo y plazas reservadas
	Vuelo findByIdVueloAndPlazasGreaterThan(int idVuelo, int plazas);
//  Datos de Vuelo por identificador
//	Vuelo findById(int id);
	
}
