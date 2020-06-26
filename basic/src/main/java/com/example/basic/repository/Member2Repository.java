package com.example.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.model.Member;

public interface Member2Repository extends JpaRepository<Member, Integer> {
	
	public Member findByNumAndName(int num, String name);
	
	

}
