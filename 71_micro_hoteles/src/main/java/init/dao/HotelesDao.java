package init.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Hotel;

public interface HotelesDao extends JpaRepository<Hotel, Integer> {
	
	/* 
	 * Datos de Hotel por identificador
	  public Hotel FindById(Integer idHotel)
	//*/
	// Lista de hoteles por localización
	@Query("select h from Hotel h where h.localizacion = ?1")
	public Hotel buscarPorLocalizacion(String localizacion);
}
