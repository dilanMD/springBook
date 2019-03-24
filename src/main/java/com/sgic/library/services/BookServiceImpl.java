package com.sgic.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Book;
import com.sgic.library.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

}
