package com.voya.testcases.trail.greet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class greetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	// this assertNull will only pass when the List is not intialized
	void testNull() {
		List<String> mylist = null;
		assertNull(mylist);
	}

	@Test
	// this assertNull will only pass when the Object is intialized
	void testNotNull() {
		List<String> mylist = Arrays.asList("Hu", "Ha", "Hu");
		assertNotNull(mylist);
	}

	@Test
	// If the references point to diff objects this assert will fail.
	void testSame() {
		String username = "Basava";
		String name = "Basava";
		assertSame(username, name, "References are same");
	}

}
