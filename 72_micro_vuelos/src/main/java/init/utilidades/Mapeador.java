package init.utilidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import init.entities.Vuelo;
import init.model.VueloDto;
@Component
public class Mapeador {

	public VueloDto VuelosEntityToDto(Vuelo vuelo) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return new VueloDto(vuelo.getIdVuelo(),
							vuelo.getCompany(),
							LocalDate.parse(vuelo.getFecha(), formatter),				
							vuelo.getPrecio(),
							vuelo.getPlazas(),
							vuelo.getDestino());
	}

	public Vuelo VueloDtoToEntity (VueloDto vueloDto) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				return new Vuelo(vueloDto.getIdVuelo(),
							vueloDto.getCompany(),
							vueloDto.getFecha().format(dtf),
							vueloDto.getPrecio(),
							vueloDto.getPlazas(),
							vueloDto.getDestino());
	}
}
