package feed.bihar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import feed.bihar.dao.MemberRepo;
import feed.bihar.repository.Member;

//@RestController
public class MemberController {

//	@Autowired
//	MemberRepo repo;
//
//	// get one member detail by ID
//	@GetMapping("member/{id}")
//	//@ResponseBody
//	public Member getMember(@PathVariable("id") int id) throws Exception {
//			return repo.findById(id).orElse(new Member()) ;
//	}
//	
//	//add a new member
//	@PostMapping(path="member", consumes = {MediaType.APPLICATION_JSON_VALUE})
//	//@ResponseBody
//	public Member addMember(@RequestBody Member mem) {
//		repo.save(mem);
//		return mem;
//	}
//	@PutMapping(path="member/{id}")
//	//@ResponseBody
//	public Member updateMember(@PathVariable("id") int id,@RequestBody Member mem) {
//	
//		
//		
//		
//		mem.setId(id);
//		repo.save(mem);
//		return mem;
//	}
//	
//	@GetMapping("member")
//	//@ResponseBody
//	public List<Member> getAll() {
//		return repo.findAll();
//	}
	
	
}
