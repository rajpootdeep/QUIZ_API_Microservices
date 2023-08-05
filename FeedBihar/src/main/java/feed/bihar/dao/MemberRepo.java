package feed.bihar.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import feed.bihar.repository.Member;


public interface MemberRepo extends JpaRepository<Member, Integer> , CrudRepository<Member, Integer>{
	
@Query("Select email from Member")
	public List<String> getAllEmail();

@Query("select count(*) from Member where status=:status")
public int countByStatus(@Param("status") String status);

	
	
	
}
