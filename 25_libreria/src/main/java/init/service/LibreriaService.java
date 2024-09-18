package init.service;

import java.util.List;

import init.model.Book;

public interface LibreriaService {
//	public List<LibroJson> recuperarTodos();
	public List<Book> recuperarRangoPrecios(double min, double max);

}
