package com.example.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	
	public Hospital findByName(String name);  // �߻� �޼ҵ�
	//public abstract Hospital findByName();  // �߻� �޼ҵ�, ���� �ۼ� �ڵ� abstract ��������
	
	public List<Hospital> findAllByAddressContainingOrderByIdDesc(String address);

}
