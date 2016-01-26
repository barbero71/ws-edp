package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import it.sogesispa.dev.ws.edp.entities.Reparti;

@Transactional
public interface RepartiRepository extends JpaRepository<Reparti, Long> 

{
	
	@Query("select r from Reparti r where TRIM(r.ip) = ?1")
	public List<Reparti> getByIp(String ip);
	
	@Query("select count (r) from Reparti r where TRIM(r.ip) = ?1")
	public int countByIp(String ip);
}
