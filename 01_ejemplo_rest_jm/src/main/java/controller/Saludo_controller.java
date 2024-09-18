package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/pruebas")
public class Saludo_controller {
	@GET
	@Path("/saludar")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSaludo() {
		return "Bienvenido a mi servicio Rest";
	}
	
	
//*	
	@GET
	@Path("/saludar/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSaludoPersonal(@PathParam("name") String nombre) {
		return "Bienvenido a mi servicio Rest Sr/a "+nombre;

	}
/*	
	@GET
	@Path("/info")
	@Produces(MediaType.TEXT_PLAIN)
//	public String getInfo(@QueryParam("name") String nombre, QueryParam("edad") int edad) {
	public String getInfo(@QueryParam ("name") String nombre, QueryParam("edad") int edad) {
		return "Te llamas "+ nombre + " y tienes "+edad+ " años";
	}
//*/
	@GET //el método se ejecutará con peticiones get
	@Path("/info")
	@Produces(MediaType.TEXT_PLAIN)
	public String getInfo(@QueryParam("name") String nombre,@QueryParam("age") int edad) {
		return "Te llamas "+nombre+" y tienes "+edad+" años";
	}
}