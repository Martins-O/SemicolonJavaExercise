package chapter9.book;

import java.util.Date;

public class PrintBook extends Book{

	private String publisher;
	private String isbn;

	public PrintBook(String title, String author, Date yearOfPub, String publisher, String isbn) {
		super(title, author, yearOfPub);
		this.publisher = publisher;
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
