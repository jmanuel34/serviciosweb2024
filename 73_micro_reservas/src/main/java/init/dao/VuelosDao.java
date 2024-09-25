package init.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import init.entities.Vuelo;

public interface VuelosDao extends JpaRepository<Vuelo, Integer> {

	//save
}
