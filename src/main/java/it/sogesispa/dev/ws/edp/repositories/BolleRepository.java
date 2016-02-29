package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.sogesispa.dev.ws.edp.entities.Bolle;

@Transactional
public interface BolleRepository extends JpaRepository<Bolle, Long> 
{
	@Query("select b from Bolle b where TRIM(b.jcls_ip) = ?1")
	public List<Bolle> getByIp(String jcls_ip);
	
	@Query("select count (b) from Bolle b where TRIM(b.jcls_ip) = ?1")
	public int countByIp(String jcls_ip);
}
