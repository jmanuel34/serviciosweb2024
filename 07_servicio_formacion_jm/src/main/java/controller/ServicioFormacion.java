package controller;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import model.Curso;


/*
 * Servicio REST formación

Crear un servicio REST que exponga un recurso que, a partir de un área recibida en la URL,
devuelva una listado de cursos que pertenezcan a dicha área. 
 */
@Path("/formacion")
public class ServicioFormacion {
	String url = "http://localhost:8080/04_crud_cursos/cursos";
	WebTarget wt=ClientBuilder
			.newClient()
			.target(url);
	

	@GET
	@Path("/buscar/{area}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Curso> buscar(@PathParam("area") String area) {
	
		
		Curso[] datos=wt
				.path("/recuperartodos/")		
				.request(MediaType.APPLICATION_JSON)
				.get(Curso[].class);
		List<Curso> res = Arrays.asList(datos);
		
		return res.stream()
				.filter(c->c.getNombre().equals(area))
				.toList();
	}
}
