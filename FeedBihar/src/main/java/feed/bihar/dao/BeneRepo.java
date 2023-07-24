package feed.bihar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import feed.bihar.repository.Bene;

public interface BeneRepo extends JpaRepository<Bene, Integer>{

	List<Bene> findByStatusOrderByName(String status);
	

	
	
	


	

}
