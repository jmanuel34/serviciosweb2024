package controller;
import java.util.List;

import model.Curso;
import service.CursosService;
@Path("/cursos")
public class CursosController {

	CursosService service = new CursosService();
	
	@POST
	@Path("/alta")
	@Consumes(MediaType)
	public void alta(Curso curso) {
		service.alta(curso);
	}
	
	public void eliminar(String nombre) {
		service.eliminar(nombre);
	}
	
	public void actualizar(Curso curso) {
		service.actualizar(curso);
	}
	public Curso buscarPorNombre(String nombre) {
		return service.buscarPorNombre(nombre);
	}
	public List<Curso> recuperarCursos() {
		return service.buscarCursos();
	}
}
