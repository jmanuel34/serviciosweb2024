import java.util.List;

import org.springframework.stereotype.Service;

import init.dao.CursosDao;
import init.model.Curso;
import init.service.CursosService;

@Service
public class CursosServiceImpl implements CursosService {
	CursosDao cursosDao;
	
	

	public CursosServiceImpl(CursosDao cursosDao) {
		super();
		this.cursosDao = cursosDao;
	}

	@Override
	public boolean guardarCurso(Curso curso) {
//		Curso curso = cursosDao.findByCurso(curso.getCurso());
		if (cursosDao.findByCurso(curso.getCurso()) != null) {
			return false;
		}
		cursosDao.save(curso);
		return true;
	}

	@Override
	public List<Curso> cursosPorDuracionMaxima(int max) {
		return cursosDao.findByDuracionMax(max);
	}

	@Override
	public List<Curso> catalogo() {
		return cursosDao.findAll();
		}

	@Override
	public boolean eliminarCurso(String curso) {
		if (cursosDao.findByCurso(curso ) == null) {
			return false;
		}
		cursosDao.delete(cursosDao.findByCurso(curso));

		return true;
	}

}
