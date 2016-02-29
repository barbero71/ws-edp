package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;

@Transactional
public interface MbpCorpoRepository extends JpaRepository<MbpCorpo, Long> 

{
	@Query("select m from MpbCorpo m where TRIM(m.mbpc_btp_id) = ?1")
	public List<MbpCorpo> getById(String mbpc_btp_id);
	
	@Query("select count (m) from MbpCorpo b where TRIM(m.mbpc_btp_id) = ?1")
	public int countById(String mbpc_btp_id);

}
