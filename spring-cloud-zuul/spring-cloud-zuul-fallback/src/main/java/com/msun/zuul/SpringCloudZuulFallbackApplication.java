package com.msun.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulFallbackApplication.class, args);
	}

}
