package procon.api.visitasfiscais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import procon.api.visitasfiscais.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

	@Query("SELECT u FROM User u WHERE u.name like %?1%")
	User findByNameQualquerCoisa(String name);
	
	User findByEmail(String email);

}
