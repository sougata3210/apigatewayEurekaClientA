package com.service1.service1;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig  {
	
	@Bean
	@LoadBalanced
	public RestTemplate getMyDAOBean() {
		return new RestTemplate();
	}

}
