package service;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class CursosService {
	private static List<Curso> cursos = new ArrayList<>(List.of(
			new Curso("Estadistica", "Basica", 140, 140.0),
			new Curso("Algebra", "Basica", 135, 150.0),
			new Curso("Estadistica", "Basica", 140, 140.0),
			new Curso("Algebra", "Basica", 135, 150.0),
			new Curso("Java 21","Programación",100,200),
			new Curso("Inglés","Idiomas",200,340),
			new Curso("Francés","Idiomas",150,320),
			new Curso("Python","Programación",60,110));
	
	public void alta(Curso curso) {
		if (buscarCurso(curso.getNombre())==null) {
			cursos.add(curso);
		}
	}
	
	public void eliminar(String nombre) {
		cursos.removeIf(c->c.getNombre().equals(nombre));
	}
	
	public void actualizar(Curso curso) {
		for (int i=0; i<cursos.size(); i++) {
			if (cursos.get(i).getNombre().equals(curso.getNombre())) {
				cursos.get(i).setArea(curso.getArea());
				cursos.get(i).setDuracion(curso.getDuracion());
				cursos.get(i).setPrecio(curso.getPrecio());
			}			
		}
	}

	public Curso buscarCurso (String nombre) {
		return cursos.stream()
				.filter(c->c.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);
				
	}

	public List<Curso> buscarTodos(){
		return cursos;
	}
}