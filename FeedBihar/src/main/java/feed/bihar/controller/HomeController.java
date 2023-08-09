package feed.bihar.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import feed.bihar.dao.BeneRepo;
import feed.bihar.dao.MemberRepo;
import feed.bihar.exceptions.bene.NoSuchBeneExist;
import feed.bihar.repository.Bene;
import feed.bihar.repository.FoodByMember;
import feed.bihar.repository.Member;

@Controller
public class HomeController {
	@Autowired
	BeneRepo repo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("aboutfeedbihar")
	public String aboutfeedbihar() {
		return "aboutfeedbihar";
	}
	
	
	@RequestMapping("beneficiary")
public String benficiaryPage() {
	return "benficiarypage";
}
	
	
	
	@RequestMapping("addBenePage")
	public String homeAddBene() {
		return "addbene";
	}

	@PostMapping("addBene")
	public String addBene(@ModelAttribute Bene b, Model m) {

		repo.save(b);
		System.out.println("Saved...");
		m.addAttribute("msg", "Database hitted successfully");
		return "addbene";
	}

	@RequestMapping("beneUpdatePage")
	public String getUpadteBenePage() {
		return "updatebene";
	}

	@GetMapping("getOneBene")
	public String getOneBene(@RequestParam int id, Model m) {

		Bene b = repo.findById(id).orElse(new Bene());

		m.addAttribute("result", b);

		return "updatebene";

	}

	@PostMapping("updateOneBene")
	public String updateOneBene(@ModelAttribute Bene b, Model m) {
		repo.flush();
		
		
		int num = b.getId();
		System.out.println(num);
		if (Optional.ofNullable(num).orElse(0) == 0)
			m.addAttribute("msg", "Invalid");
		else {
			repo.save(b);
			m.addAttribute("msg", "Database hitted successfully");
		}
		return "updatebene";
	}

	@RequestMapping("listOptionPage")
	public String listOptionPage() {
		System.out.println("in calling listebne pagae...");
		return "listbene";
	}

	@GetMapping("listByStatus")
	public String getBeneByStatus(@RequestParam String status, Model m) {
		m.addAttribute("result", repo.findByStatusOrderByName(status));
		m.addAttribute("msg", status);
		return "listingbene";
	}

	@GetMapping("getallbene")
	public String getAllBene(Model m) {

		m.addAttribute("result", repo.findAll());
		m.addAttribute("msg", "All");
		return "listingbene";
	}

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("ms", "Database hitted successfully");
	}

	
	
}
