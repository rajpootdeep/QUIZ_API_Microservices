package feed.bihar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feed.bihar.dao.MemberRepo;
import feed.bihar.repository.Member;
import java.util.List;
@Service
public class MemService {

	
	@Autowired
	MemberRepo repo;
	
	public Member add(Member mem) {
		List<String> list=repo.getAllEmail();
		if(list.parallelStream().anyMatch(e -> e.equalsIgnoreCase(mem.getEmail())))
		
		repo.save(mem);
		return mem;
		
	}

	public int[] getMemData() {
	int ar[]=new int[3];
	
	ar[0]=(int) repo.count();
		ar[1]= repo.countByStatus("Active");
		ar[2]= repo.countByStatus("Inctive");
		return ar;
	}
	
	
	
	

}
