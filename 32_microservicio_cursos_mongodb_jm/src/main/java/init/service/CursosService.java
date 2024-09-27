package init.service;

import java.util.List;

import org.springframework.stereotype.Service;

import init.model.Curso;
@Service
public interface CursosService {
	// No se admiten cursos con el mismo nombre
	public boolean guardarCurso(Curso curso);
	List<Curso> cursosPorDuracionMaxima(int max);
	List<Curso> catalogo();
	// Si el curso no existe, devuelve falso
	boolean eliminarCurso(String curso);
	
}
