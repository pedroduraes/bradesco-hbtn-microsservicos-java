package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class HelloWorldResource {

	@GetMapping("/home")
	public String login() throws Exception {
		return "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
	}

}
