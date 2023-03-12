package org.tnsif.dao;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookDao {

	//abstract method by default
	public abstract Book getBookById(Integer id); 
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getBookByAuthor(String author);
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getBooksRange (Double low, double high); 
	
	
}
