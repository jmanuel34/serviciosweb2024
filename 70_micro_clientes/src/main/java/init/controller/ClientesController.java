package init.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import init.model.ClienteDto;
import init.service.ClientesService;
@RestController
public class ClientesController {
	ClientesService service;

	public ClientesController(ClientesService clientesService) {
		super();
		this.service = clientesService;
	}
	
	@GetMapping(value="autenticar/{usuario}/{password}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ClienteDto autenticar(@PathVariable("usuario") String usuario, @PathVariable("password")String password) {
		ClienteDto cliente = service.autenticar(usuario, password);
		System.out.println("Cliente: "+ cliente.getUsuario());
		return cliente;
	}
	
	@PostMapping(value="registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String registrar(@RequestBody ClienteDto clienteDto) {
		String valor=String.valueOf(service.registrar(clienteDto));
		System.out.println("Valor registro:" +valor);
		return valor;
	}
	
	@GetMapping(value="autenticaruser/{usuario}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ClienteDto autenticar(@PathVariable("usuario") String usuario) {
		ClienteDto cliente = service.autenticar(usuario, usuario);
		System.out.println("Cliente: "+ cliente.getUsuario());
		return cliente;
	}

}
