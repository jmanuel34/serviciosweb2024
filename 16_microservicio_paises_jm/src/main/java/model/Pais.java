package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pais {
	@JsonProperty("name")
	private String nombre;
	@JsonProperty("region")
	private String continente;
	private String capital;
	@JsonProperty("population")
	private long  poblacion;
	@JsonProperty("flag")
	private String bandera;

	public Pais() {}

	public Pais(String nombre, String continente, String capital, long poblacion, String bandera) {
		super();
		this.nombre = nombre;
		this.continente = continente;
		this.capital = capital;
		this.poblacion = poblacion;
		this.bandera = bandera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}

	public String getBandera() {
		return bandera;
	}

	public void setBandera(String bandera) {
		this.bandera = bandera;
	}
	
}
