package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping("/user-id/{id}")
	public String findUserById(@PathVariable int id) {
//findUserById - Retornar a mensagem “You have entered valid ID” se o ID informado for maior que 0 e menor que 100. Caso contrário exibir a mensagem ‘You have entered invalid ID’.

		String msg = "You have entered valid ID";
		if (id <= 0 || id > 100) {
			throw new UserIdException(String.valueOf(id));
		}
		return msg;
	}

	@GetMapping("/user-name/{userName}")
	public String findUserByName(@PathVariable String userName) {
//findUserByUserName - Retornar a mensagem “You have entered valid USERNAME” se a quantidade de caracteres do username informado for maior que 3 e menor que 15. Caso contrário exibir a mensagem ‘You have entered invalid USERNAME’.

		String msg = "You have entered valid USERNAME";
		if (userName.length() < 3 || userName.length() > 15) {
			throw new UserNameException(userName);
		}
		return msg;
	}

	@GetMapping("/user-cpf/{cpf}")
	public String findUserByCPF(@PathVariable String cpf) {
//findUserByCPF - Retornar a mensagem ‘You have entered valid CPF’ se a quantidade de caracteres do CPF informado for maior que 3 e menor que 15. Caso contrário exibir a mensagem ‘You have entered invalid CPF’.

		String msg = "You have entered valid CPF";
		boolean isCPFValid = isCPF(cpf);
		if (!isCPFValid) {
			throw new CPFException(cpf);
		}
		return msg;

	}

	public boolean isCPF(String CPF) {
		return (CPF.length() >= 3 && CPF.length() <= 15);
	}

}
