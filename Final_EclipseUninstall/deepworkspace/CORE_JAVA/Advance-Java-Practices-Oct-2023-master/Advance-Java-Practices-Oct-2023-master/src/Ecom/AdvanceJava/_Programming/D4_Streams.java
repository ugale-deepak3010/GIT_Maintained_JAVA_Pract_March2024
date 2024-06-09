package Ecom.AdvanceJava._Programming;

import java.util.ArrayList;

/*
 
 I/O stream is totally different from this Stream
 
 Stream is return item from collection.
 Stream is in inbuild method in Java8 .. 
 it provide multiple inbuild methods for any kind of operations.
 filter and all
 
 */

public class D4_Streams {

	public static void main(String[] args) {
		ArrayList<Book> books= MyBookLibrary();
		
		books.parallelStream()
		.filter(book -> {
			return book.getAuthor().startsWith("D");
		} )
		.forEach(System.out::println);
		
		System.out.println("------");
		
		books.stream()
		.filter(book -> {
			return book.getAuthor().startsWith("D");
		} )
		.forEach(System.out::println);
		
		System.out.println("------");
		
		books.stream().filter(book -> {
			return book.getAuthor().startsWith("M");
		} ).filter(book -> {
			return book.getTitle().startsWith("X");
		} ).forEach(System.out::println);
		
	}
	
	static ArrayList<Book> MyBookLibrary(){
		
		ArrayList<Book> books=new ArrayList<>();
		
		books.add(new Book("Mee", "Xee Bk"));
		books.add(new Book("Di", "Di Bk"));
		books.add(new Book("Mi", "Xi Bk"));
		books.add(new Book("Di", "Di Bk"));
		books.add(new Book("Deee", "Deee Bk"));
		books.add(new Book("Deepak", "Deepak Bk"));
		return books;
	}
}



class Book{
	
	private String author;
	private String title;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + "]";
	}
	
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}
}
