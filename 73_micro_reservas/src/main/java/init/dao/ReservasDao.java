package init.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import init.entities.Reserva;

public interface ReservasDao extends JpaRepository<Reserva, Integer> {

	// Alta reserva 
	// (save)
	
	
	// Lista de reservas por cliente
	//findByUsuario 
	List<Reserva> findByUsuario(String usuario);
}
