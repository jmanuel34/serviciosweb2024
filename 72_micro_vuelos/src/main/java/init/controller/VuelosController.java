package init.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import init.entities.Vuelo;
import init.model.VueloDto;
import init.service.VuelosService;

@RestController
public class VuelosController {
	VuelosService service;
	
	public VuelosController(VuelosService service) {
		super();
		this.service = service;
	}

	@GetMapping(value="buscarPorDestinoyPlazas/{destino}/{plazas}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<VueloDto> listadoPorDestinoyPlazas(@PathVariable ("destino") String destino, @PathVariable ("plazas") Integer plazas) {
		return service.buscarPorDestinoyPlazas(destino, plazas);
	}

	@GetMapping(value="buscarVuelo/{idVuelo}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<VueloDto> buscarVuelo(@PathVariable("idVuelo")Integer idVuelo) {
		return service.findById(idVuelo);
	}
	
	@PutMapping(value="actualizar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarVuelo(@RequestBody Vuelo vuelo)  {
		service.actualizar(vuelo.getIdVuelo(), vuelo.getPlazas());
	}
}