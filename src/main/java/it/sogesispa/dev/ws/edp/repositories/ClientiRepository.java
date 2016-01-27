package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.sogesispa.dev.ws.edp.entities.Clienti;

@Transactional
public interface ClientiRepository extends JpaRepository<Clienti, Long> 
{
	@Query("select c from Clienti c where TRIM(c.ip) = ?1")
	public List<Clienti> getByIp(String ip);
	
	@Query("select count (c) from Clienti c where TRIM(c.ip) = ?1")
	public int countByIp(String ip);
}
