package init.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class LibroJson {
	private int isbn;
	private String titulo;
	private String autor;
	private double precio;
	private int paginas;
	
	@JsonAlias("TemaDto")
	private TemaJson tema;
//	@JsonAlias("TemaDto.nombreTema")
//	private String tematica;

	public LibroJson() {
	}

	public LibroJson(int isbn, String titulo, String autor, double precio, int paginas, TemaJson tema) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.paginas = paginas;
		this.tema = tema;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public TemaJson getTema() {
		return tema;
	}

	public void setTema(TemaJson tema) {
		this.tema = tema;
	}

}