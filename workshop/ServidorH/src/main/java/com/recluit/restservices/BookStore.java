package com.recluit.restservices;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	private List<Book> allBooks;
	

	public BookStore(){
		allBooks = new ArrayList<Book>();
		allBooks.add(new Book("Sir Arthur Conan Doyle","Sherlock Holmes"));
		allBooks.add(new Book("Bram Stoker","Dracula"));
	}
	
	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	
	
}
