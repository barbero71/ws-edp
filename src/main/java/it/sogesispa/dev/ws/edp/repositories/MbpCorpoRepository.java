package it.sogesispa.dev.ws.edp.repositories;

//import java.util.List;

import javax.transaction.Transactional;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;

@Transactional
public interface MbpCorpoRepository extends CrudRepository<MbpCorpo, Long> 

{
//	@Query("select c from MpbCorpo c where c.mbpc_btp_id = ?1")
//	public List<MbpCorpo> getById(int mbpc_btp_id);
//	
//	@Query("select count (c) from MbpCorpo c where c.mbpc_btp_id = ?1")
//	public int countById(int mbpc_btp_id);

}
