package init.service;

import org.springframework.stereotype.Service;

import init.model.ClienteDto;
@Service
public interface ClientesService {
	public boolean registrar(ClienteDto clienteDto);
	public ClienteDto autenticar(String usuario, String password);

}
