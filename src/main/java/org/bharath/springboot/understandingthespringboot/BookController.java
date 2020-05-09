package org.bharath.springboot.understandingthespringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "DS & Algo", "Author A"));
		books.add(new Book(2, "String 5.0 ", "Author B"));
		books.add(new Book(2, "Java 8.0 ", "Author C"));
		return books;
	}
}
