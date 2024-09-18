package model;

public class Ficha {
	private String producto;
	private int precio;
	private String categoria;
	
	public Ficha() {}
	
	public Ficha(String producto, int precio, String categoria) {
		super();
		this.producto = producto;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
