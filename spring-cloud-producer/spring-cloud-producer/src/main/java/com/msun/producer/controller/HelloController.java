package com.msun.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static Logger LOGGER = LoggerFactory
			.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {

		LOGGER.info("Print hello "+name+"，this is producer0 first messge");
		return "hello "+name+"，this is producer0 first messge";
	}

}
