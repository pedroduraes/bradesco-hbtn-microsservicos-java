package com.example.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	void messageWelcome() throws Exception {
		RequestBuilder request = get("/calculator/welcome");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
	}

	@Test
	void addNumbers() throws Exception {
		RequestBuilder request = get("/calculator/addNumbers").param("number1", "1").param("number2", "2");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("3.0", result.getResponse().getContentAsString());
	}

	@Test
	void subNumbers() throws Exception {
		RequestBuilder request = get("/calculator/subNumbers").param("number1", "2").param("number2", "1");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("1.0", result.getResponse().getContentAsString());
	}

	@Test
	void divideNumbers() throws Exception {
		RequestBuilder request = get("/calculator/divideNumbers").param("number1", "10").param("number2", "5");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("2.0", result.getResponse().getContentAsString());
	}

	@Test
	void factorial() throws Exception {
		RequestBuilder request = get("/calculator/factorial").param("factorial", "10");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("3628800", result.getResponse().getContentAsString());
	}

	@Test
	void calculeDayBetweenDate() throws Exception {
		LocalDate d1 = LocalDate.of(2020, 3, 15);
		LocalDate d2 = LocalDate.of(2020, 3, 29);
		RequestBuilder request = get("/calculator/calculeDayBetweenDate").param("localDate1", d1.toString())
				.param("localDate2", d2.toString());
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("14", result.getResponse().getContentAsString());
	}

	@Test
	void integerToBinary() throws Exception {
		RequestBuilder request = get("/calculator/integerToBinary").param("number1", "20");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("10100", result.getResponse().getContentAsString());
	}

	@Test
	void integerToHexadecimal() throws Exception {
		RequestBuilder request = get("/calculator/integerToHexadecimal").param("number1", "5");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("5", result.getResponse().getContentAsString());
	}

}