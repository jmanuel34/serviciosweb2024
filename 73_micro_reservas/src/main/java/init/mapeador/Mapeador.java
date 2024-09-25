package init.mapeador;
import org.springframework.stereotype.Component;

import init.entities.Hotel;
import init.entities.Reserva;
import init.entities.Vuelo;
import init.model.HotelDto;
import init.model.ReservaDto;
import init.model.VueloDto;

@Component
public class Mapeador {
	public HotelDto hotelToDto(Hotel hotel) {
		return new HotelDto(hotel.getIdHotel(),
				hotel.getNombre(),
				hotel.getCategoria(),
				hotel.getPrecio(),
				hotel.isDisponible(),
				hotel.getLocalizacion());
	}
	public Hotel dtoToHotel(HotelDto hotel) {
		return new Hotel(hotel.getIdHotel(),
				hotel.getNombre(),
				hotel.getCategoria(),
				hotel.getPrecio(),
				hotel.isDisponible(),
				hotel.getLocalizacion());
	}
	public VueloDto vueloToDto(Vuelo vuelo) {
		return new VueloDto(vuelo.getIdVuelo(),
				vuelo.getCompany(),
				vuelo.getFecha(),
				vuelo.getPrecio(),
				vuelo.getPlazas(),
				vuelo.getDestino());
	}
	public Vuelo dtoToVuelo(VueloDto vuelo) {
		return new Vuelo(vuelo.getIdVuelo(),
				vuelo.getCompany(),
				vuelo.getFecha(),
				vuelo.getPrecio(),
				vuelo.getPlazas(),
				vuelo.getDestino());
	}
	public ReservaDto reservaToDto(Reserva reserva) {
		return new ReservaDto(
				reserva.getIdReserva(),
				reserva.getUsuario(),
				vueloToDto(reserva.getVuelo()),
				hotelToDto(reserva.getHotel()),
				reserva.getPrecio());
	}
	public Reserva dtoToReserva(ReservaDto reserva) {
		System.out.print("Id Reserva:" +reserva.getIdReserva()+" ");
		System.out.print("Usuario:" +reserva.getUsuario()+" ");
		System.out.print("Hotel:" +reserva.getHotelDto().getIdHotel()+" ");
		System.out.print("Vuelo:" +reserva.getVueloDto().getCompany()+" ");
		System.out.print("Precio:" +reserva.getPrecio()+" ");
				
		return new Reserva(
				reserva.getIdReserva(),
				reserva.getUsuario(),
				dtoToVuelo(reserva.getVueloDto()),
				dtoToHotel(reserva.getHotelDto()),
				reserva.getPrecio());
	}
} 