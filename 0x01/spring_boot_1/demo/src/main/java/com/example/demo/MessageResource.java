package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

	@GetMapping("/simpleMessageWelcome")
	public String simpleMessageWelcome() {
		return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";

	}

	@GetMapping("/login")
	public String login(@RequestParam String user, @RequestParam String password) throws Exception {
		
		/*
		 * user ou password em branco ou não informados => “USUÁRIO E SENHA NÃO INFORMADOS”

			user ou password com mais que 15 caracteres => “USUÁRIO E SENHA INVÁLIDOS”

			user e senha informados corretamente => “LOGIN EFETUADO COM SUCESSO !!!”
		 * */
		
		if (user == null || password == null) {
			throw new Exception("USUÁRIO E SENHA NÃO INFORMADOS");
		} else if (user.length() > 15 || password.length() > 15) {
			throw new Exception("USUÁRIO E SENHA INVÁLIDOS");
		} else {
			return "LOGIN EFETUADO COM SUCESSO !!!";
		}

	}
}
