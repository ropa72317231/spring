package com.example.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.basic.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
