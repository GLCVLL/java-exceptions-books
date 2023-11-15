package org.java.exceptions;

public class Book {

	public String title;
	public int pageNumber;
	public String author;
	public String publisher;
	
	//CONSTRUCTOR
	
	public Book(String title, int pageNumber, String author, String publisher) {
		
		this.title = title;
		this.pageNumber = pageNumber;
		this.author = author;
		this.publisher = publisher;

	}
	
	// GETTER & SETTER


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Libro" + "/n" +
				"Titolo=" + title + "/n" +
		        "Pagine=" + pageNumber + "/n" +
				"Autore=" + author + "/n" +
		        "Editore=" + publisher;
	}
		
	
}
