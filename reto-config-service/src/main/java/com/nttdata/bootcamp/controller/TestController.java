package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${product.product-name}")
	private String myProductName;
	 
	@GetMapping(path="/getProductName")
	public String myProductName() {
	  return this.myProductName;
	}
	
	@Value("${product.product-color}")
	private String myProductColor;
	 
	@GetMapping(path="/getProductColor")
	public String myProductColor() {
	  return this.myProductColor;
	}
}
