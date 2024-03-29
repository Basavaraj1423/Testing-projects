package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderDetailsTest {

	@Mock
	IBookService bookService;

	@InjectMocks
	OrderDetails orderdetails;

	List<Book> bookList;
	OrderDetailsTest detailsTest;
	Book book1, book2, book3, book4, book5;

	@BeforeEach
	void setUp() throws Exception {
		// String title, String author, Integer bookId, double price)
		book1 = new Book("Social", "Naveen", 101, 4000);
		book2 = new Book("Java", "Naveen", 102, 5000);
		book3 = new Book("IDGAF", "Suman", 103, 6000);
		book4 = new Book("EVS", "Naveen", 104, 7000);
		book5 = new Book("The power of subconcious mind", "Naveen", 101, 2000);
		bookList = Arrays.asList(book1, book2, book3, book4, book5);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderdetails = null;
	}

	@Test
	@Disabled
	void testShowBooks() throws BookNotFoundException {
		String author = "Naveen";
		List<Book> booksByAuthor = Arrays.asList(book1, book2, book4, book5);
		Mockito.when(bookService.getByAuthor(author)).thenReturn(booksByAuthor);
		List<Book> expected = Arrays.asList(book4, book2, book1, book5);
		List<Book> actual = orderdetails.showBooks(author);
		assertEquals(expected, actual);

	}

	@Test
	@Disabled
	void testShowEmptyBooks() {

		String author = "Arya";
		Mockito.when(bookService.getByAuthor(author)).thenReturn(new ArrayList());
		assertThrows(BookNotFoundException.class, () -> orderdetails.showBooks(author));

	}

	@Test
	void testExceptionShowBooks() {
		String author = "Arya";
		Mockito.when(bookService.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class, () -> orderdetails.showBooks(author));

	}

}
