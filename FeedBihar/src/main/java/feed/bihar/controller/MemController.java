package feed.bihar.controller;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import feed.bihar.dao.MemberRepo;
import feed.bihar.repository.Member;
import feed.bihar.service.MemService;

@Controller
public class MemController {

	@Autowired
	MemService memservice;

	@RequestMapping("memberpage")
	public String memberPage(Model m) {
		int ar[]=memservice.getMemData();
		m.addAttribute("result", ar);
		return "memberpage";
	}
	
	
	@RequestMapping("callBecomeMemPage")
	public String callBecomeMemPage() {
		return "becomemem";
	}
	
	@PostMapping("addnewmember")
	public String AddNewMem(@ModelAttribute Member mem, Model m) {
		Member member = memservice.add(mem);
		m.addAttribute("msg", "Successfully submitted Your Unique ID :  "+member.getId());
		return "becomemem";
	}
	
	

}
