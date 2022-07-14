package com.cristiansuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristiansuperior.dsmeta.entities.Sale;
import com.cristiansuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
