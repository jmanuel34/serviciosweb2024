package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Curso;

@Service
public interface CursosService {

	boolean alta(Curso curso);

	void eliminar(String nombre);

	void modificarDatos(Curso curso);

	Curso buscarCurso(String nombre);

	List<Curso> devuelveCursos();

}