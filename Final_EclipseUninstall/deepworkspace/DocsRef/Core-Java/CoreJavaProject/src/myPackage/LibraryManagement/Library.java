package myPackage.LibraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

	private List<Book> books = new ArrayList<Book>();

	public void addBook(String title, String author, String genre) {

		books.add(new Book(title, author, genre));
	}

	public Book searchBookByTitle(String searchTitle) {
		
		Optional<Book> b= books.stream().filter(book->book.getTitle().equals(searchTitle)).findAny();
		System.out.println(b.toString());
		

		for (Book book : books) {

			if (book.getTitle().equals(searchTitle)) {

				return book;
			}
		}
		
		
		return null;
	}
	
	public void displayByGenre(String genre) {
		
		books.stream().filter(book->book.getGenre().equals(genre)).forEach(book->System.out.println(book));
	}

}
