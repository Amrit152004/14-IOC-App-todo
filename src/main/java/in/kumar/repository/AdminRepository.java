package in.kumar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.kumar.Entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, String> {
	@Query("select ae.pass from AdminEntity ae where ae.email=:x")
	Optional<String> findByEmail(@Param("x") String email);

	

	
		
	

}
