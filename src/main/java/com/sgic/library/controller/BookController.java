package com.sgic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/saveBook")
	public HttpStatus createBook(@Valid @RequestBody Book book) {
		bookService.saveBook(book);
		return HttpStatus.CREATED;
	}
}
