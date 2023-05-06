package chapter9.book;

import java.util.Date;

public class Book {

	private String title;
	private String author;
	private Date yearOfPub;

	public Book(String title, String author, Date yearOfPub) {
		this.title = title;
		this.author = author;
		this.yearOfPub = yearOfPub;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getYearOfPub() {
		return yearOfPub;
	}

	public void setYearOfPub(Date yearOfPub) {
		this.yearOfPub = yearOfPub;
	}

	@Override
	public String toString() {
		return "Book{" +
			"title='" + title + '\'' +
			", author='" + author + '\'' +
			", yearOfPub=" + yearOfPub +
			'}';
	}
}
