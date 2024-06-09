package com.bookPackage.Controller;

@SuppressWarnings("serial")
public class BookNotFoundException extends RuntimeException {
	
	public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
