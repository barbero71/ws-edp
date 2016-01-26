package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import it.sogesispa.dev.ws.edp.entities.Utenti;

@Transactional
public interface UtentiRepository extends JpaRepository<Utenti, Long> 

{
	
	@Query("select u from Utenti u where TRIM(u.ip) = ?1")
	public List<Utenti> getByIp(String ip);
	
	@Query("select count (u) from Utenti u where TRIM(u.ip) = ?1")
	public int countByIp(String ip);
}
