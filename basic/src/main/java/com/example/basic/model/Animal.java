package com.example.basic.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Component  // 4������ ���� => Stereotype, Service, Repository, Component)
			// �޸𸮿� ���(�ν��Ͻ�)

public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name = "Test";
	private String gender;
	private String kind;

}
