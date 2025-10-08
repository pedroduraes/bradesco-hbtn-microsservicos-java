package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calc = new Calculator();

	@Test
	void sumTest() {
		assertEquals(calc.sum(Double.valueOf(1), Double.valueOf(1)), Double.valueOf(2));
	}

	@Test
	public void numbersNullSumTest() {
		assertThrows(NullPointerException.class, () -> calc.sum(null, null));
	}

	@Test
	void subTest() {
		assertEquals(calc.sub(Double.valueOf(1), Double.valueOf(1)), Double.valueOf(0));
	}

	@Test
	void divideTest() {
		assertEquals(calc.divide(Double.valueOf(10), Double.valueOf(5)), Double.valueOf(2));
	}

	@Test
	public void divisionByZeroTest() {
		assertThrows(ArithmeticException.class, () -> calc.divide(Double.valueOf(10), Double.valueOf(0)));
	}

	@Test
	void factorialTest() {
		assertEquals(calc.factorial(10), 3628800);
	}

	@Test
	void integerToBinaryTest() {
		assertEquals(calc.integerToBinary(20).toString(), "10100");
	}

	@Test
	void integerToHexadecimalTest() {
		assertEquals(calc.integerToHexadecimal(5).toString(), "5");
	}

	@Test
	void calculeDayBetweenDateTest() {
		assertEquals(calc.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 29)), 14);
	}
}