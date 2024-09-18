package init.dao;
/*
 * Microservicio de libros
Expondrá los siguiente recursos:

-Busqueda de libros por tema: Recibe el nombre de tema en la url y devuelve los libros de dicho tema
-Busqueda de libro: recibe el isbn en la url y devuelve el libro. Si el isbn no existe, informa al cliente con un código de estado 409
-Alta de libro. recibe un json con los datos del libro en el body y lo da de alta. No se puede repetir isbn, por lo que si ya existe se informa al cliente con un código de estado 406

Securización:
busqueda de libros por tema: acceso libre
busqueda de libro: cualquier usuario autenticado
alta de libro: solo administradores

Usar la base de datos springsecurity del ejercicio anterior 
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.entities.Libro;

public interface LibrosDao extends JpaRepository<Libro, Integer> {
	@Query("select l from Libro l where l.tema.idTema=?1")
	List<Libro> findByIdTema(int idTema);
}
