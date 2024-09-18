package init.entities;
/*
 * microservicio de libros

Expondrá los siguiente recursos:

-Busqueda de libros por tema: Recibe el nombre de tema en la url y devuelve los libros de dicho tema
-Busqueda de libro: recibe el isbn en la url y devuelve el libro. Si el isbn no existe, informa al cliente con un código de estado 409
-Alta de libro. recibe un json con los datos del libro en el body y lo da de alta. No se puede repetir isbn, por lo que si ya existe se informa al cliente con un código de estado 406

Securización:
busqueda de libros por tema: acceso libre
busqueda de libro: cualquier usuario autenticado
alta de libro: solo administradores

Usar la base de datos springsecurity del ejercicio anterior 
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libros")

public class Libro {
	@Id
	private int isbn;
	private String titulo;
	private String autor;
	private double precio;
	private int paginas;
	@ManyToOne
	@JoinColumn(name="idTema",referencedColumnName = "idTema")
	private Tema tema;

	public Libro(int isbn, String titulo, String autor, double precio, int paginas, Tema tema) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.paginas = paginas;
		this.tema = tema;
	}

	public Libro() {
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

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
	
}
