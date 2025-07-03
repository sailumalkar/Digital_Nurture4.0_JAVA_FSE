package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
	 private BookRepository bookRepository;

	    // Setter for Spring Injection
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void displayBook() {
	        System.out.println("BookService: calling BookRepository...");
	        bookRepository.fetchBook();
	    }
}
