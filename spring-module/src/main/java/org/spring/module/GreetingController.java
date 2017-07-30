package org.spring.module;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class GreetingController {

	@Value("${dynamic.message:Fucker}")
	private String dynamicMessage;

	@RequestMapping("/hello")
	String hello() {
		return "Hello, " + dynamicMessage + "!!!";
	}
}
