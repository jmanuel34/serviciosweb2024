package init.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import init.model.ReservaDto;
import init.service.ReservasService;

@RestController
public class ReservasController {	
	ReservasService service;
	
	public ReservasController(ReservasService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value="alta", consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public boolean alta(@RequestBody ReservaDto reservaDto) {
		System.out.println("Controller ReservaDto: " +reservaDto.getUsuario());
		return service.alta(reservaDto);
	}
	
	@GetMapping(value="reservasCliente/{cliente}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<ReservaDto> reservasPorCliente(@PathVariable("cliente") String cliente){

		return service.reservas(cliente);
	}

}
