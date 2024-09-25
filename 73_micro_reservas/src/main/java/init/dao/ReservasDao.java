package init.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Reserva;
import init.entities.Vuelo;

public interface ReservasDao extends JpaRepository<Reserva, Integer> {

	// Alta reserva 
	// (save)
	
	
	// Lista de reservas por cliente
	//findByUsuario 
	List<Reserva> findByUsuario(String usuario);
	
	// Plazas disponibles para un vuelo
	@Query("select v from Vuelo v where v.idVuelo=?1")
	Vuelo findByIdVuelo (int idVuelo);
	
}
