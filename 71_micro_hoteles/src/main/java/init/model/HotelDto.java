package init.model;

import org.springframework.stereotype.Component;

@Component
public class HotelDto {
	private int id;
	private String nombre;
	private int categoria;
	private double precio;
	private boolean disponible;
	private String localizacion;

	public HotelDto() {}

	public HotelDto(int id, String nombre, int categoria, double precio, boolean disponible, String localizacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
		this.localizacion = localizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	

}

