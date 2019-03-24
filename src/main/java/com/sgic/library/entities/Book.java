//Entity is represented as model
package com.sgic.library.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "library",name = "book" )
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String bookName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
}
