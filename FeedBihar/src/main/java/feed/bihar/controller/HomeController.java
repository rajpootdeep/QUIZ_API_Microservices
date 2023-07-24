package feed.bihar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import feed.bihar.dao.BeneRepo;
import feed.bihar.repository.Bene;
@Controller
public class HomeController {
@Autowired
	BeneRepo repo;

@RequestMapping("/")
public String home() {
	System.out.println("In controller");
	return "index";
}
@RequestMapping("aboutfeedbihar")
public String aboutfeedbihar() {
	return "aboutfeedbihar";
}

@RequestMapping("addBenePage")
public String homeAddBene() {
	
	return "addbene";
}
@PostMapping("addBene")
	public String addBene(@ModelAttribute Bene b,  Model m ) {
		
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
	m.addAttribute("result", repo.getReferenceById(id));
	
	return "updatebene";
	
}
@PostMapping("updateOneBene")
public String updateOneBene(@ModelAttribute Bene b, Model m) {
	
	repo.save(b);
	m.addAttribute("msg", "Database hitted successfully");
	return "updatebene";	
}

@RequestMapping("listOptionPage")
public String listOptionPage() {
	System.out.println("in calling listebne pagae...");
	return "listbene";
}

@GetMapping("listByStatus")
public String getBeneByStatus(@RequestParam String status ,Model m) {
	m.addAttribute("result",repo.findByStatusOrderByName(status));
	m.addAttribute("msg",status );
	return "listingbene";
}
@GetMapping("getallbene")
public String getAllBene(Model m) {
	
	m.addAttribute("result", repo.findAll());
	m.addAttribute("msg","All" );
	return "listingbene";
}

@ModelAttribute
public void modelData(Model m) {
	m.addAttribute("ms", "Database hitted successfully");
}
}
