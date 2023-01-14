 package com.service1.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DataRetrievalController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get-address")
	String dataFetchFromService1() {
		//restTemplate.g
		
		ResponseEntity<Object> response 
		 = restTemplate.getForEntity("http://address-service/address"  , Object.class);
		
		System.out.println("body:"+response.getBody());
		
		if(response!=null) {
			return "success";
		}
		return "failure";
	}

}
