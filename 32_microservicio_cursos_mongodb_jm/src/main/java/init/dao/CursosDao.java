package init.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import init.model.Curso;

public interface CursosDao extends MongoRepository<Curso, String> {
	//recuperar curso por nombre
	Curso findByCurso(String nombre);

	// cursos de duracion inferior al parametro
	@Query("{'duracion':{'$lt':?0}")
	List<Curso> findByDuracionMax(int max);
	
	// eliminar curso por nombre
	void deleteByCurso(String curso);
	
}
