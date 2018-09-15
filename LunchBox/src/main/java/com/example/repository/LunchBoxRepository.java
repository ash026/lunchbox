package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Tiffin;

@Repository
public interface LunchBoxRepository extends JpaRepository<Tiffin, Integer>{

}
