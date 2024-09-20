package init.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Cliente;

public interface ClientesDao extends JpaRepository<Cliente, String> {
	@Query("select c from Cliente c where c.usuario=?1 and c.password=?2")
	public Cliente autenticar(String usuario, String password);
//	public boolean registrar (Cliente cliente);

}
