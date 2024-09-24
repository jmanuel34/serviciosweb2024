package init.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVuelo;
	private String company;
	private String fecha;
	private double precio;
	private int plazas;
	private String destino;
	
	public Vuelo() {}

	public Vuelo(int idVuelo, String company, String fecha, double precio, int plazas, String destino) {
		super();
		this.idVuelo = idVuelo;
		this.company = company;
		this.fecha = fecha;
		this.precio = precio;
		this.plazas = plazas;
		this.destino = destino;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


}
