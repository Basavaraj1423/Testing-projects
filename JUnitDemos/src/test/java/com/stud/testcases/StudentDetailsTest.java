package com.stud.testcases;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exceptions.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentDetailsTest {
	StudentDetails details = null;

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
		details = new StudentDetails();
		System.out.println("This is the BeforeEach ");
	}

	@AfterEach
	void tearDown() throws Exception {
		details = null;
		System.out.println("This is the AfterEach ");
	}

	@Test
	void testTotalMarks() throws InvalidNumberException {
		assertEquals(165,details.totalMarks(50, 55, 60),"Expected result is 165");
	}
//	@Test
//	@Tag("Negative")
//	@DisplayName("This is the testing of Negative Marks")
//	void testNegativeTotalMarks() {
//		assertThrows(InvalidNumberException.class, ()->details.totalMarks(50, -55, 60));
//	}
//	
//	@Test
//	@DisplayName("This is the testing of Greater Marks")
//	void testGreaterTotalMarks() {
//		assertThrows(InvalidNumberException.class, ()->details.totalMarks(150, 155, 160));
//	}
	
	

}







