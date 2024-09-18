package service;

import java.util.List;

import model.Pais;

public interface PaisesService {
	List<String> getContinentes();
	List<Pais> paisesPorContinente(String continente);

}
