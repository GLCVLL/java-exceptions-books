package org.java.exceptions;

public class Book {

	private String title;
	private int pageNumber;
	private String author;
	private String publisher;
	
	//CONSTRUCTOR
	
	public Book(String title, int pageNumber, String author, String publisher) throws Exception {
		
        setTitle(title);
        setPageNumber(pageNumber);
        setAuthor(author);
        setPublisher(publisher);

	}
	
	// GETTER & SETTER


	public String getTitle() {
		return title;
	}

    public void setTitle(String title) throws Exception {
        if (title == null || title.trim().isEmpty()) {
            throw new Exception("Il titolo non può essere vuoto.");
        }
        this.title = title;
    }

	public int getPageNumber() {
		return pageNumber;
	}

    public void setPageNumber(int pageNumber) throws Exception {
        if (pageNumber <= 0) {
            throw new Exception("Il numero di pagine deve essere maggiore di zero.");
        }
        this.pageNumber = pageNumber;
    }	

	public String getAuthor() {
		return author;
	}

    public void setAuthor(String author) throws Exception {
        if (author == null || author.trim().isEmpty()) {
            throw new Exception("L'autore non può essere vuoto.");
        }
        this.author = author;
    }

	public String getPublisher() {
		return publisher;
	}

    public void setPublisher(String publisher) throws Exception {
        if (publisher == null || publisher.trim().isEmpty()) {
            throw new Exception("L'editore non può essere vuoto.");
        }
        this.publisher = publisher;
    }
	
	
	public String toString() {
	    return "Libro\n" +
	            "Titolo= " + title + "\n" +
	            "Pagine= " + pageNumber + "\n" +
	            "Autore= " + author + "\n" +
	            "Editore= " + publisher + "\n" +
	            "\n---------------------\n";
	}	
}

