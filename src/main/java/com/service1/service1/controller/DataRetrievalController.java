 package com.service1.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service1.service1.exception.DataNotFoundException;

@RestController
public class DataRetrievalController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get-address")
	String dataFetchFromService1() throws Exception {
		//restTemplate.g
		
		ResponseEntity<Object> response 
		 = restTemplate.getForEntity("http://address-service/address"  , Object.class);
		
		System.out.println("body:"+response.getBody());
		
		if(response.getBody()==null) {
			throw new DataNotFoundException("Data not found");
		}
		return "success";
	}
	
	

}
