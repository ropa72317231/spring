package com.example.basic.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class 회원가입 {

	@GetMapping("/sign_in")
	public String signin() {
		return "sign_in";
	}
	@GetMapping("/sign_in2")
	public String signin2(
			Model model, String id, String pw) {
		if(id.equals("a") && pw.equals("1")) {
			// 로그인 성공
			model.addAttribute("msg", "success");
		} else {
			// 로그인 실패
			model.addAttribute("msg", "fail");
		}
		return "sign_in2";
	}
}
	
