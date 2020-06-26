package com.example.basic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;  
	String title;
	String content;
	String owner;
	int hit;
	String creDate; // �����ͺ��̽��� "cre_data" �� �����

}
