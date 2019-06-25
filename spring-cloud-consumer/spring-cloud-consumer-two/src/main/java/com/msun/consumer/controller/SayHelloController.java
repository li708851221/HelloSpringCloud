package com.msun.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class SayHelloController {
	Logger logger= LoggerFactory.getLogger(SayHelloController.class);
	@Value("${lee.hello}")
	private String hello;

	@RequestMapping("/sayhello")
	public String from() {
		logger.info("request two name is hello");
		try{
			Thread.sleep(1000000);
		}catch ( Exception e){
			logger.error(" hello two error",e);
		}
		return this.hello;
	}
}