package controller;
/*
 * Microservicio buscador
Dos recursos:
-buscar por temática
-alta de nuevo resultado
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import model.ResultadoDto;
import service.BuscadorService;


@RestController
public class BuscadorController {
	@Autowired
	@Qualifier("buscadorEstandar")
	BuscadorService buscadorService;
	
	public BuscadorController(BuscadorService BuscadorService) {
		this.buscadorService= BuscadorService;
	}
	
	@GetMapping(value="buscar/{tematica}",produces=MediaType.APPLICATION_JSON_VALUE)
	public String buscarResultados(@RequestParam("tematica") String tematica, HttpServletRequest request) {
		List<ResultadoDto> resultados=buscadorService.buscar(tematica);
		request.setAttribute("resultados", resultados);
		return "resultados";
	}
	@PostMapping(value="alta", produces=MediaType.TEXT_PLAIN_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String altaResultado(@ModelAttribute ResultadoDto resultado) {		
		return String.valueOf(buscadorService.agregar(resultado));
	}
	
}
