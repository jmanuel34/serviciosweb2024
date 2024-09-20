package init.utilidades;

import org.springframework.stereotype.Component;

import init.entities.Hotel;
import init.model.HotelDto;

@Component
public class Mapeador {
	HotelDto hotelDto;

	public Mapeador(HotelDto hotelDto) {
		super();
		this.hotelDto = hotelDto;
	}
	
	public HotelDto HotelEntityToDto(Hotel hotel) {
		return new HotelDto(hotel.getId(),
							hotel.getNombre(),
							hotel.getCategoria(),
							hotel.getPrecio(),
							hotel.isDisponible(),
							hotel.getLocalizacion());
		
	}
	public Hotel HotelDtoToEntity(HotelDto hotelDto) {
		
		return new Hotel(hotelDto.getId(),
				hotelDto.getNombre(),
				hotelDto.getCategoria(),
				hotelDto.getPrecio(),
				hotelDto.isDisponible(),
				hotelDto.getLocalizacion());
	}
}
