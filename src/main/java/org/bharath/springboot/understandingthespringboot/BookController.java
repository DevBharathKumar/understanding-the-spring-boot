package org.bharath.springboot.understandingthespringboot;

import java.util.ArrayList;
import java.util.List;

import org.bharath.springboot.understandingthespringboot.customException.CustomException;
import org.bharath.springboot.understandingthespringboot.data.AuthorData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "DS & Algo", "Author AB"));
		books.add(new Book(2, "String 5.0 ", "Author B"));
		books.add(new Book(2, "Java 8.0 ", "Author C"));
		return books;
	}
	
	@PostMapping("/author")
	public String allowAuthor(@RequestBody AuthorData data)
	{
		if(!(data.getPassword().equalsIgnoreCase("God"))) {
			throw new CustomException(100, "error.msg.incorrect.password",
				"Please check the password you have enetered");
		}
		
		return "Great";
	}
	
}
