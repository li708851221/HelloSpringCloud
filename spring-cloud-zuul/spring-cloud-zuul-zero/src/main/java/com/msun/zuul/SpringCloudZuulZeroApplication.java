package com.msun.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulZeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulZeroApplication.class, args);
	}

}
