package chapter9.book;

import java.util.Date;

public class AudioBook extends Book{

	private String bookSize;
	private String playLength;
	private String artistName;

	public AudioBook(String title, String author, Date yearOfPub, String bookSize, String playLength, String artistName) {
		super(title, author, yearOfPub);
		this.bookSize = bookSize;
		this.playLength = playLength;
		this.artistName = artistName;
	}

	public String getBookSize() {
		return bookSize;
	}

	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}

	public String getPlayLength() {
		return playLength;
	}

	public void setPlayLength(String playLength) {
		this.playLength = playLength;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
}
