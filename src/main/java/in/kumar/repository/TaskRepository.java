package in.kumar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.kumar.Entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
	@Query("select ae from TaskEntity ae where ae.temailid=:x")
	List<TaskEntity> findByEmail(@Param("x") String email);
	@Query("select ae from TaskEntity ae where ae.temailid=:x")
	void updateById(@Param("x") Integer tId);
	@Modifying
	@Query("UPDATE TaskEntity ae SET ae.tdate = :x, ae.ttime = :y WHERE ae.id = :z")
	void updateByIdData(@Param("z") Integer tId, @Param("x") String tdate, @Param("y") String ttime);


	
	

}
