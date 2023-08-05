package feed.bihar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import feed.bihar.repository.Bene;

public interface BeneRepo extends JpaRepository<Bene, Integer>, CrudRepository<Bene, Integer>{

	List<Bene> findByStatusOrderByName(String status);

	
	
	

	
	

	
	
	


	

}
