package feed.bihar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feed.bihar.dao.FoodByMemberRepo;
import feed.bihar.repository.FoodByMember;

@Service
public class FoodByMemberService {

	
	@Autowired
	FoodByMemberRepo repo;
	
public void addFood(FoodByMember mbf) {
		
		repo.save(mbf);
	}
	
	
	
	
	
	
}
