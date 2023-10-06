package kr.kh.semi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainPage() {
		logger.info("메인페이지 시작");
		
		return "/main/home";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		logger.info("메인페이지 시작");
		
		return "/member/about";
	}
	
}
