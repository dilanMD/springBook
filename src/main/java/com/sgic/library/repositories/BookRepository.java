//Repositories is used to implement entity specified JPA queries
package com.sgic.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	
}
