package feed.bihar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import feed.bihar.repository.FoodByMember;

public interface FoodByMemberRepo extends JpaRepository<FoodByMember, Long>, CrudRepository<FoodByMember, Long> {

	
	
}
