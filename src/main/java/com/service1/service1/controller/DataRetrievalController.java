 package com.service1.service1.controller;

import com.service1.service1.config.CustomPropConfig;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service1.service1.exception.DataNotFoundException;

@RestController()
@Tag(name = "Data Retrieval Controller", description = "Operations related to users")
//@RequestMapping("/demo")
public class DataRetrievalController {
	CustomPropConfig propConfig;
	@Autowired
	public  DataRetrievalController(RestTemplate restTemplate,CustomPropConfig propConfig){

        this.restTemplate = restTemplate;
		this.propConfig = propConfig;
    }
	public final RestTemplate restTemplate;



	/*@Autowired(required = false)
	RestTemplate restTemplate;
	*/
	@GetMapping("/get-address")
	@Operation(summary = "data Fetch FromService1", description = "Returns data from Service1")
	String dataFetchFromService1() throws Exception {
		//restTemplate.g
		System.out.println("prop1;"+propConfig.prop1);

		ResponseEntity<Object> response
		 = restTemplate.getForEntity("http://address-service/address"  , Object.class);

		return "success";
//
//		System.out.println("body:"+response.getBody());
//
//		if(response.getBody()==null) {
//			throw new DataNotFoundException("Data not found");
//		}
//		return "success";
	}
	
	

}
