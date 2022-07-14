package com.cristiansuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristiansuperior.dsmeta.entities.Sale;
import com.cristiansuperior.dsmeta.services.SaleServices;

@RestController
@RequestMapping(value="/Sales")
public class SaleController {
	
	@Autowired
	private SaleServices service;
	
	@GetMapping
	public List<Sale> findSales(){
		return	service.findSales();
	}
}
