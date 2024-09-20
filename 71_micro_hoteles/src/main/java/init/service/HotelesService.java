package init.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import init.model.HotelDto;

@Service
public interface HotelesService {
	// Datos de Hotel por identificador
	Optional<HotelDto> buscarPorId(int idHotel);
	
	// Lista de hoteles por localizacion
	List<HotelDto> buscarPorLocalizacion(String localizacion);
}
