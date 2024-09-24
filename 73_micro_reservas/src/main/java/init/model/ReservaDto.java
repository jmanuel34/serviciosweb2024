package init.model;

import init.entities.Hotel;
import init.entities.Vuelo;

public class ReservaDto {
	private int idReserva;
	private String usuario;
	private VueloDto vuelo;
	private HotelDto hotel;
	private double precio;
	
	public ReservaDto() {}

	public ReservaDto(int idReserva, String usuario, VueloDto vuelo, HotelDto hotel, double precio) {
		super();
		this.idReserva = idReserva;
		this.usuario = usuario;
		this.vuelo = vuelo;
		this.hotel = hotel;
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

	public VueloDto getVuelo() {
		return vuelo;
	}

	public void setVuelo(VueloDto vuelo) {
		this.vuelo = vuelo;
	}

	public HotelDto getHotel() {
		return hotel;
	}

	public void setHotel(HotelDto hotel) {
		this.hotel = hotel;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
