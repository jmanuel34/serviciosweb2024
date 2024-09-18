package service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestClient;

import model.Pais;

public class PaisesServiceImpl implements PaisesService {

	String url="https://restcountries.com/v2/all";
	RestClient restClient;
	
	public PaisesServiceImpl(RestClient restClient) {
		this.restClient=restClient;
	}
	
	@Override
	public List<String> getContinentes() {
		return Arrays.stream(restClient
				.get()
				.uri(url)
				.retrieve()
				.body(Pais[].class)
			)
			.map(p->p.getContinente())
			.toList();
	}
/*
	@Override
	public List<Pais> getPaises(String continente) {
		return Arrays.stream(restClient
				.get()
				.uri(url)
				.retrieve()
				.body(Pais[].class)
			)
				.filter(p->p.getContinente().equals(continente))
	}
//*/	
//*
@Override
	public List<Pais> paisesPorContinente(String continente) {
		return Arrays.stream(restClient
				.get()
				.uri(url)
				.retrieve()
				.body(Pais[].class)) //Stream<Pais>
				.filter(p->p.getContinente().equals(continente))
				.toList();
	} 
//*/
}
