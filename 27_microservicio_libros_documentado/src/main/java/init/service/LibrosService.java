package init.service;

import java.util.List;

import init.model.LibroDto;

public interface LibrosService {
	boolean alta(LibroDto libro);
	List<LibroDto> todosLibros();
	List<LibroDto> buscarLibroPortema(String tema);
	LibroDto buscarLibroPorIsbn(int isbn);
}
