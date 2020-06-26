package com.example.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.basic.model.Hospital;
import com.example.basic.repository.HospitalRepository;

@RestController
public class HospitalController {
	@Autowired
	HospitalRepository hr;
	
	@GetMapping("/hospital")
	public Hospital get(String name) {
		Hospital hospital =  hr.findByName(name);		//이름으로 자료 조회, 키워드 정확하게 검색
		return hospital;
	}

	@GetMapping("/hospital_list")		//주소 키워드로 자료 조회, 여러개로 검색(list로 작성)
	public List<Hospital> getList(String address) {
		List<Hospital> hospitalList = hr.findAllByAddressContainingOrderByIdDesc(address);
		return hospitalList;
	}

}


