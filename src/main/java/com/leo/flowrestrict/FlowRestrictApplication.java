package com.leo.flowrestrict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FlowRestrictApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowRestrictApplication.class, args);
	}

}
