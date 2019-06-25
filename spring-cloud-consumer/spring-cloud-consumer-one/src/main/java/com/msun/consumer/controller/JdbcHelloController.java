package com.msun.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class JdbcHelloController {
	@Value("${lee.hello}")
	private String hello;

	@RequestMapping("/jdbchello")
	public String from() {
		return this.hello;
	}
}