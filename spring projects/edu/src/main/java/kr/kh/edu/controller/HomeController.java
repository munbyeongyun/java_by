package kr.kh.edu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model, String id) {
		System.out.println("id : " + id);
		return "/main/home";
	}
	@GetMapping("/{id}")
	public String id(@PathVariable("id") String id2) {
		System.out.println("id2 : " + id2);
		return "redirect:/";
	}
	@GetMapping("/ajax/test")
		public String ajaxTest() {
		
		return "/main/ajax";
	}
}
