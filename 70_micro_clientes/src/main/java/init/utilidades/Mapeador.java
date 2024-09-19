package init.utilidades;

import init.entities.Cliente;
import init.model.ClienteDto;

public class Mapeador {
	ClienteDto clienteDto;
	
	public Mapeador(ClienteDto clienteDto) {
		this.clienteDto=clienteDto;
	}
//*	
	public ClienteDto clienteEntityToDto(Cliente cliente) {
		return new ClienteDto(cliente.getUsuario(),
				cliente.getPassword(),
				cliente.getDireccion(),
				cliente.getTarjeta(),
				cliente.getDni());
	}
//*	
	public Cliente clienteDtoToEntity(ClienteDto clienteDto) {
		return new Cliente(clienteDto.getUsuario(),
							clienteDto.getPassword(),
							clienteDto.getDireccion(),
							clienteDto.getTarjeta(),
							clienteDto.getDni());
	}
//*/
}
