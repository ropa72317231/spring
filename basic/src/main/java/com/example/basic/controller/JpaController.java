//package com.example.basic.controller;
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//
//import com.example.basic.model.Article;
//import com.example.basic.repository.ArticleRepository;
//
//@Controller
//public class JpaController {
//	@Autowired
//	ArticleRepository articleRepository;
//	
//	@GetMapping("/write")
//	public String wright() {
//		return "write";
//	}
//	
//	@PostMapping("/write")
//	@ResponseBody // ajax로 데이터를 넘기고 받기 위해서 ResponseBody 사용(json으로 데이터 다시 넘겨 받음)
//	public Article writePost(@ModelAttribute Article article) {
//		Article result = articleRepository.save(article);
//		return result;
//	}
//}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	// TreeRepository 가져오기 (스프링 내에서만 사용)
////	@Autowired
////	TreeRepository tr;
////
////	@GetMapping("/tree_add")
////	@ResponseBody
////	public String tree_add() {
////		Tree tree = new Tree();
////		tree.setColor("RED");
////		tree.setName("소나무");
////		tr.save(tree);
////		return "ok";
////	}
////
////	@GetMapping("/tree")
////	@ResponseBody
////	public String tree() {
////		List<Tree> list = tr.findAll(); // select All
////
////		return list.toString();
////
////	}
////
////}
