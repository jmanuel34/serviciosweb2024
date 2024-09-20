package init.service;

import init.dao.ClientesDao;
import init.entities.Cliente;
import init.model.ClienteDto;
import init.utilidades.Mapeador;

public class ClientesServiceImpl implements ClientesService {
	
	ClientesDao dao;
	Mapeador mapeador;
	
	public ClientesServiceImpl(ClientesDao dao) {
		this.dao=dao;
	}

	@Override
	public boolean registrar(ClienteDto clienteDto) {
		if (dao.autenticar(clienteDto.getUsuario(), clienteDto.getPassword()) == null) {
			dao.save(mapeador.clienteDtoToEntity(clienteDto));
			return true;
		}
		return false;
	}

	@Override
	public ClienteDto autenticar(String usuario, String password) {
		Cliente cliente= dao.autenticar(usuario, password);	
		if (cliente!=null) return mapeador.clienteEntityToDto(cliente);
		return new ClienteDto();

	}
}
