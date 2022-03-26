package com.wilson.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index(@RequestParam String name) {
		return "Greetings from Spring Boot! Hello: " + name ;
	}

}
