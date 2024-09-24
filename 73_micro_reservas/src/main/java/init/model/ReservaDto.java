package init.model;

import org.springframework.stereotype.Component;

@Component
public class ReservaDto {
	private int idReserva;
	private String usuario;
	private VueloDto vueloDto;
	private HotelDto hotelDto;
	private double precio;
	
	public ReservaDto() {}

	public ReservaDto(int idReserva, String usuario, VueloDto vueloDto, HotelDto hotelDto, double precio) {
		super();
		this.idReserva = idReserva;
		this.usuario = usuario;
		this.vueloDto = vueloDto;
		this.hotelDto = hotelDto;
		this.precio = precio;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public VueloDto getVueloDto() {
		return vueloDto;
	}

	public void setVueloDto(VueloDto vueloDto) {
		this.vueloDto = vueloDto;
	}

	public HotelDto getHotelDto() {
		return hotelDto;
	}

	public void setHotelDto(HotelDto hotelDto) {
		this.hotelDto = hotelDto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
}
