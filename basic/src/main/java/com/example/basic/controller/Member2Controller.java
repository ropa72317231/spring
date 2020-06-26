package com.example.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.basic.model.Member;
import com.example.basic.repository.Member2Repository;


@Controller
public class Member2Controller {
	@Autowired
	Member2Repository mr2;
	
	@GetMapping("/sign_in")
	public String signin() {
		return "sign_in";
	}
	
	@PostMapping("/sign_in")
	@ResponseBody
	public Map<String, Object> signin2(
			@ModelAttribute Member member) {
		System.out.println(member);
		Member result = mr2.findByNumAndName(member.getNum(), member.getName());
		System.out.println("result " + result);
		Map<String, Object> map = new HashMap();
		map.put("msg", "¼º°ø");
		
		return map;
	}
	
	
	
}



