//package com.example.basic.controller;
//
//
//import java.io.File;
//import java.io.IOException;
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
//public class Aricle2Controller {
//	@Autowired
//	ArticleRepository articleRepository;
//	
//	@GetMapping("/write")
//	public String write() {
//		return "write";
//	}
//	
//	@PostMapping("/write")
//	@ResponseBody // ajax�� �����͸� �ѱ�� �ޱ� ���ؼ� ResponseBody ���(json���� ������ �ٽ� �Ѱ� ����)
//	public Article writePost(@ModelAttribute Article article) {
//		Article result = articleRepository.save(article);
//		return result;
//	}
//	
//	@GetMapping("/write")
//	public String upload2() {
//		return "write";
//	}
//	@PostMapping("/write")
//	@ResponseBody
//	
//	public String uploadPost(MultipartHttpServletRequest mRequest) {
//		String result2 = "";
//		List<MultipartFile> mFiles = mRequest.getFiles("file");
//		for(int i = 0; i < mFiles.size(); i++) {
//			MultipartFile mFile = mFiles.get(i);
//			String oFileName = mFile.getOriginalFilename();
//			
//			File file = new File("c:/dev/fileUpload/" + oFileName);
//			String sFileName = "";
//			
//			if( file.exists() ) {
//				int idx = oFileName.lastIndexOf(".");
//				String name = oFileName.substring(0, idx);
//				String ext = oFileName.substring(idx);
//				sFileName = name + "_" + "copy" + ext;
//			} else {
//				sFileName = oFileName;
//			}
//			try {
//				mFile.transferTo(new File("c:/dev/fileUpload/" + sFileName));
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return result2;
//	}
//	
//	
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
////	// TreeRepository �������� (������ �������� ���)
////	@Autowired
////	TreeRepository tr;
////
////	@GetMapping("/tree_add")
////	@ResponseBody
////	public String tree_add() {
////		Tree tree = new Tree();
////		tree.setColor("RED");
////		tree.setName("�ҳ���");
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
