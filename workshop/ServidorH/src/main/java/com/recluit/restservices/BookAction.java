package com.recluit.restservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/book")
public class BookAction{
	
	private String bookQuery = "Dracula";
	private BookStore bookStore;
	private String bookResultAuthor;// used to store the result
	private String bookResultTitle;//
	
	
	@GET
	@Path("/{title}")
	//@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String execute(@PathParam("title") String title) throws Exception{
		bookStore = new BookStore();
		for(Book book:bookStore.getAllBooks()){
			if(book.getTitle().equals(title)){
				bookResultAuthor = book.getAuthor();
				bookResultTitle = book.getTitle();
				return bookResultAuthor+"|"+bookResultTitle;
			}				
		}
		return "Error Book Not Found";
	}

	public String getBookQuery() {
		return bookQuery;
	}

	public void setBookQuery(String bookQuery) {
		this.bookQuery = bookQuery;
	}

	public BookStore getBookStore() {
		return bookStore;
	}

	public void setBookStore(BookStore bookStore) {
		this.bookStore = bookStore;
	}

	public String getBookResultAuthor() {
		return bookResultAuthor;
	}

	public void setBookResultAuthor(String bookResultAuthor) {
		this.bookResultAuthor = bookResultAuthor;
	}

	public String getBookResultTitle() {
		return bookResultTitle;
	}

	public void setBookResultTitle(String bookResultTitle) {
		this.bookResultTitle = bookResultTitle;
	}
	
	
}
