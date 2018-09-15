package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.TiffinAddresses;

@Repository
public interface TiffinAddressesRepository extends JpaRepository<TiffinAddresses, Integer>{

}
