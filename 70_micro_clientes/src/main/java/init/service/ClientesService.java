package init.service;

import init.model.ClienteDto;

public interface ClientesService {
	public boolean registrar(ClienteDto clienteDto);
	public ClienteDto autenticar(String usuario, String password);

}
