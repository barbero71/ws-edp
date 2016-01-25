package it.sogesispa.dev.ws.edp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import it.sogesispa.dev.ws.edp.entities.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> 

{
	
	@Query("select u from User u where TRIM(u.ip) = ?1")
	public List<User> getByIp(String ip);
	
	@Query("select count (u) from User u where TRIM(u.ip) = ?1")
	public int countByIp(String ip);
}
