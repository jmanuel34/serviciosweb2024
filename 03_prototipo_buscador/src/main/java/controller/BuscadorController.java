package controller;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import model.Resultado;
import service.BuscadorService;

 @Path("/buscador")
public class BuscadorController {
	 BuscadorService buscadorService = new BuscadorService();
	 @GET
	 @Path("buscar/{tematica}")
	 @Produces(MediaType.APPLICATION_JSON)
	public List<Resultado> fichaProducto(@PathParam("tematica") String tematica) {
		
		return buscadorService.buscar(tematica);
	}
	 
	@POST
	@Path("/alta")
	@Consumes(MediaType.APPLICATION_JSON)
	public void alta(Resultado resultado) {
		buscadorService.alta(resultado);
	}

	/*
	 * Añadir un nuevo recurso al servicio que permita eliminar un resultado a partir
de la url recibida como parámetro. El recurso devolverá una lista con todos los
resultados que queden después de la eliminación 
	 */
	@DELETE
	@Path("/eliminar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Resultado> eliminar(@QueryParam("url") String url) {
		return buscadorService.eliminar(url);
	}
}
