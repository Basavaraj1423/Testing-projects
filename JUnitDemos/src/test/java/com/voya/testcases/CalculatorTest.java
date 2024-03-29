package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator = null;

	@BeforeAll
	static void init() throws Exception {
		System.out.println("This is the BeforeAll ");
	}

	@AfterAll
	static void cleanUp() throws Exception {
		System.out.println("This is the AfterAll ");

	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("This is the BeforeEach ");

	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("This is the AfterEach ");

	}

	@Test
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30, actual, "Expected output is 30");

	}

	@Test
	void testProduct() {
		int actual = calculator.product(10, 20);
		assertEquals(200, actual, "Expected output is 200");
	}

	@Test
	void testGreet() {
		String actual = calculator.greet("Surya");
		assertEquals("Hello Surya", actual, "Expected result is Hello Basavaraj");
	}

	@Test
	@Tag("First")
	// @Disabled //This annotation is use to stop the particular method to execute.
	void testShowCourses() {
		List<String> expected = Arrays.asList("CSS", "Java", "Spring", "Angular", "Html");
		assertEquals(expected, calculator.showCourse(Arrays.asList("CSS", "Java", "Spring", "Angular", "Html")),
				"Both are same now");
	}

}
