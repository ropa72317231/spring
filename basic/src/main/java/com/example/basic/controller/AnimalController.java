package com.example.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.basic.model.Animal;
import com.example.basic.repository.AnimalRepository;

@Controller
public class AnimalController {

	@Autowired
	AnimalRepository ar;
	
	@Autowired
	Animal animal;


	
	// 오버로딩 Overloading - 메소드 명은 같고, 인자의 개수/종류/순서가 다른 형태
	@GetMapping("/animal_html")
	public String animal(Model model) {
		System.out.println(animal);
		List<Animal> list = ar.findAll();
		model.addAttribute("list", list);
		return "animal";
	}
	
		@GetMapping("/animal")
		@ResponseBody
		public String animal() {
			List<Animal> list = ar.findAll();
			return list.toString();
	}
	
}
