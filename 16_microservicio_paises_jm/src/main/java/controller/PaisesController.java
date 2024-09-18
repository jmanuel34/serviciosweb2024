package controller;

import service.PaisesService;
@RestControler
public class PaisesController {
	PaisesService service;

	public PaisesController (PaisesService service) {
		this.service= service;
	}
	
	@GetMapping(value="continentes", produces)
}
