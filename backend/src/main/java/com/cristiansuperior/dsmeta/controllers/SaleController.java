package com.cristiansuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cristiansuperior.dsmeta.entities.Sale;
import com.cristiansuperior.dsmeta.services.SaleServices;

@RestController
@RequestMapping(value="/Sales")
public class SaleController {
	
	@Autowired
	private SaleServices service;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,  
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable Pageable){
		return	service.findSales(minDate, maxDate, Pageable);
	}
}
