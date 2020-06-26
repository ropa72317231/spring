package com.example.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@GetMapping("/free")
	public String free(Model model, String title) {
		model.addAttribute("title", title);
		return "index";
	}
	
	
	// Log4J -> Slf4j
	Logger logger =  LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		System.out.println("print");
		logger.trace("trace!");
		logger.debug("debug!");
		logger.info("info!");
		logger.warn("warn!");
		logger.error("error!");
		
		return "home";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String test2() {
		return "redirect:/free";	// redirect => test1 주소로 다시 되돌리는 것
	}

	
	
	
	
	
}
