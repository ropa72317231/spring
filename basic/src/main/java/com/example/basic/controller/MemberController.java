package com.example.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.basic.model.Member;
import com.example.basic.repository.MemberRepository;


@Controller
public class MemberController {
	@Autowired
	MemberRepository mr;
	
	@GetMapping("/sign_up")
	public String signup() {
		return "sign_up";
	}
	@PostMapping("/sign_up")
	@ResponseBody
	public Member signupPost(@ModelAttribute Member member) {
		return mr.save(member);
	}
}
	
	




