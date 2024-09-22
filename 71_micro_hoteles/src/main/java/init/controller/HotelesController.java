package init.controller;

import java.util.ArrayList;
import java.util.List;

import init.entities.Hotel;
import init.service.HotelesService;

public class HotelesController {
	
	HotelesService service;

	public HotelesController(HotelesService service) {
		super();
		this.service = service;
	}
	
	
	public List<Hotel> buscarPorLocalidad() {
		return new ArrayList<Hotel>();
	}
	
	public HotelDto buscarPorId(int idHotel) {
		return service.buscarPorId(idHotel);
	}

}
