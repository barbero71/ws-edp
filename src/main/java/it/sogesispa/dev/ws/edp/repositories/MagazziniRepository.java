package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import it.sogesispa.dev.ws.edp.entities.Magazzini;

@Transactional
public interface MagazziniRepository extends JpaRepository<Magazzini, Long> 

{
	
	@Query("select m from Magazzini m where TRIM(m.ip) = ?1")
	public List<Magazzini> getByIp(String ip);
	
	@Query("select count (m) from Magazzini m where TRIM(m.ip) = ?1")
	public int countByIp(String ip);
}
