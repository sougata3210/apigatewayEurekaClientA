package com.service1.service1;

import com.service1.service1.config.CustomPropConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//@OpenAPIDefinition(
//		info = @Info(
//				title = "My App API",
//				version = "1.0",
//				description = "API documentation for My App"
//		)
//)

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties(CustomPropConfig.class)
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

}
