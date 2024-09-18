package init.service;
/*
 * -Busqueda de libros por tema: Recibe el nombre de tema en la url y devuelve los libros de dicho tema
-Busqueda de libro: recibe el isbn en la url y devuelve el libro. Si el isbn no existe, 
	informa al cliente con un código de estado 409
-Alta de libro. recibe un json con los datos del libro en el body y lo da de alta. No se puede repetir isbn, por lo que si ya existe se informa al cliente con un código de estado 406

 */
import java.util.List;

import init.entities.Tema;
import init.model.LibroDto;
import init.model.TemaDto;

public interface LibrosService {
	List<TemaDto> getTemas();

	List<LibroDto> librosTema(int idTema);

	List<LibroDto> todosLibros();
	LibroDto getLibro(int isbn);
	boolean guardarLibro(LibroDto libro);
/*
	TemaDto getTema(int idTema);

	
	
	TemaDto buscarTemaTituloLibro(String titulo);
//*/
}
