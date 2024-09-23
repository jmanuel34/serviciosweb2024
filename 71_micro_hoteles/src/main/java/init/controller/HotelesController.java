package init.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import init.model.HotelDto;
import init.service.HotelesService;
@RestController
public class HotelesController {
	
	HotelesService service;

	public HotelesController(HotelesService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(value="buscarPorLocalidad/{localidad}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDto> buscarPorLocalidad(@PathVariable("localidad") String localidad) {
		return service.buscarPorLocalizacion(localidad);
		
	}
	
	@GetMapping(value="buscarPorId/{idHotel}", produces=MediaType.APPLICATION_JSON_VALUE)
	public HotelDto buscarPorId(@PathVariable("idHotel") int idHotel) {
		return service.buscarPorId(idHotel);
	}

}
