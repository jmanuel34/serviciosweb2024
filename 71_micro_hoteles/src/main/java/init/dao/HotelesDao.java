package init.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Hotel;

public interface HotelesDao extends JpaRepository<Hotel, Integer> {
	/*
	@Query("select h from Hoteles h where h.idHotel=?1")
	public Hotel buscarPorIdHotel(int idHotel);
	 
	 * Datos de Hotel por identificador
	  public Hotel FindById(Integer idHotel)
	//*/
	// Lista de hoteles por localización
//	@Query("select c from Cliente c where c.usuario=?1 and c.password=?2")
	@Query("select h from Hotel h where h.localizacion=?1")
	public List<Hotel> buscarPorLocalizacion(String localizacion);
}
