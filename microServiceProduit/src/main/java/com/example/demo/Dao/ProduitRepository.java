package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entities.Produit;

public interface ProduitRepository extends MongoRepository<Produit, Long>{
	
	@Query(value="{'designation':{$regex:?0,$options:'i'} }")
	public List<Produit>produitParMC(String mc);
	@Query(value="{'designation':{$regex:?0,$options:'i'} }")
	public Page<Produit>produitParMC(String mc, Pageable p);
	
public List<Produit>	findByDesignation(String des);

public Page<Produit> findByDesignation(String des, Pageable p);


	
}
