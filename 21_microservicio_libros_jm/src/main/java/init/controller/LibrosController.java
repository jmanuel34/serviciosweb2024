package init.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import init.entities.Libro;
import init.model.LibroDto;
import init.service.LibrosService;

@CrossOrigin("*")
@RestController
public class LibrosController {
	LibrosService service;
	
	public LibrosController(LibrosService service) {
		super();
		this.service = service;
	}
	
	@GetMapping (value="buscar/{tematica}")
	public List<LibroDto> buscarPorTema(@PathVariable("tematica") String tema) {
		return service.librosTema(Integer.parseInt(tema));
	}
	
	@PostMapping(value="/alta", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> altaLibro(LibroDto libro) {
		if (service.guardarLibro(libro)) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);	
	}
	
	@GetMapping (value="buscarlibros")
	public ResponseEntity<LibroDto> buscarPorIsbn(@PathVariable("isbn") int isbn) {
		LibroDto libro = service.getLibro(isbn);
		if (libro!=null) {
			return new ResponseEntity<>(libro, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				
	}
	
	@GetMapping (value="catalogo", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<LibroDto> buscarTodosLibros() {
		return service.todosLibros();
	}
	
	
	

}
