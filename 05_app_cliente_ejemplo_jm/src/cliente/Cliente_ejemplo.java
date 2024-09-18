package cliente;

import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class Cliente_ejemplo {

	public static void main(String[] args) {
		String url="http://localhost:8080/01_ejemplo_rest/pruebas";
		WebTarget wt=ClientBuilder
					.newClient() //Client
					.target(url);  //WebTarget
		// llamada a los recursos
		String mensaje1= wt
		.path("/saludar") //WebTarget
		.request(MediaType.TEXT_PLAIN) // Builder
		.get(String.class);				//String
		System.out.println(mensaje1);
		
		String mensaje2= wt
				.path("/saludar/alumno")
				.request(MediaType.TEXT_PLAIN)
				.get(String.class);
		
		
		String mensaje3= wt
				.path("/info")
				.queryParam("name", "pepe")
				.queryParam(mensaje2, args)
	}				

}
