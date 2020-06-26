package com.example.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
	public Hospital findByName(String name);  // 추상 메소드
	//public abstract Hospital findByName();  // 추상 메소드, 원래 작성 코드 abstract 생략가능
	
	public List<Hospital> findAllByAddressContainingOrderByIdDesc(String address);

}
