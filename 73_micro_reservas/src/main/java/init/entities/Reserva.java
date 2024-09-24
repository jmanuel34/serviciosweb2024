package init.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")

public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="idreserva")
	private int idReserva;
	private String usuario;
	@ManyToOne()
	@JoinColumn(name="vuelo", referencedColumnName="idVuelo")
	private Vuelo vuelo;
	@ManyToOne()
	@JoinColumn(name="hotel", referencedColumnName="idHotel")
	private Hotel hotel;
	private double precio;
	
	public Reserva() {}

	public Reserva(int idReserva, String usuario, Vuelo vuelo, Hotel hotel, double precio) {
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

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
}
