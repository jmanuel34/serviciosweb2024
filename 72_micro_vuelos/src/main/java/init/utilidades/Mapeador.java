package init.utilidades;

import org.springframework.stereotype.Component;

import init.entities.Vuelo;
import init.model.VueloDto;
@Component
public class Mapeador {

	public VueloDto VuelosEntityToDto(Vuelo vuelo) {
		return new VueloDto(vuelo.getIdVuelo(),
							vuelo.getCompany(),
							vuelo.getFecha(),
							vuelo.getPrecio(),
							vuelo.getPlazas(),
							vuelo.getDestino());
	}

	public Vuelo VueloDtoToEntity (VueloDto vueloDto) {
		return new Vuelo(vueloDto.getIdVuelo(),
							vueloDto.getCompany(),
							vueloDto.getFecha(),
							vueloDto.getPrecio(),
							vueloDto.getPlazas(),
							vueloDto.getDestino());
	}
}
