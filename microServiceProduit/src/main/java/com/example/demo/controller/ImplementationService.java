package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.ProduitRepository;
import com.example.demo.entities.Produit;

@RestController
public class ImplementationService {
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping("/save")
	public Produit saveProduit(Produit p) {
		
		produitRepository.save(p);
		return p ;
	}
	
	
	@RequestMapping("/all")
	public List <Produit> getProduits(){
		
		
		return produitRepository.findAll();
		
	}


	@RequestMapping("/produits")

	public Page <Produit> getProduits(int page){

		
	return produitRepository.findAll( PageRequest.of(0, 3));	
	}
	
	@RequestMapping("/get")
	public Produit getProduit(Long ref){
		return produitRepository.findById(ref).orElse(null);
	}
	@RequestMapping("/delete")
	public boolean delete(Long ref){
		 produitRepository.deleteById(ref);
		 return true;
	}
	@RequestMapping("/update")
	public Produit update(Produit p){
		return produitRepository.save(p);
	}
}