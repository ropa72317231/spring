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
		Hospital hospital =  hr.findByName(name);		//�̸����� �ڷ� ��ȸ, Ű���� ��Ȯ�ϰ� �˻�
		return hospital;
	}

	@GetMapping("/hospital_list")		//�ּ� Ű����� �ڷ� ��ȸ, �������� �˻�(list�� �ۼ�)
	public List<Hospital> getList(String address) {
		List<Hospital> hospitalList = hr.findAllByAddressContainingOrderByIdDesc(address);
		return hospitalList;
	}

}


