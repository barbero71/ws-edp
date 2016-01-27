package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.sogesispa.dev.ws.edp.entities.Articoli;

public interface ArticoliRepository extends JpaRepository<Articoli, Long> 
{

	@Query("select a from Articoli a where TRIM(a.ip) = ?1")
	public List<Articoli> getByIp(String ip);
	
	@Query("select count (a) from Articoli a where TRIM(a.ip) = ?1")
	public int countByIp(String ip);
}
