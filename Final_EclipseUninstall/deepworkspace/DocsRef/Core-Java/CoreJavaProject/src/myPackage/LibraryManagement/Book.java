package myPackage.LibraryManagement;

public class Book {

	private String title;
	private String author;
	private String genre;
	
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}

	public Book(String title, String author, String genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
