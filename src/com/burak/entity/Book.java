package com.burak.entity;

import com.burak.repository.IView;

public class Book implements IView {
	String title;
	String author;
	int isbn;
	int publicationYear;

	Book[] book = new Book[4];

	public Book(String title, String author, int isbnNo, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbnNo;
		this.publicationYear = publicationYear;

	}

	public Book() {

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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	@Override
	public void goruntule() {
		System.out.println("kitap görüntelemesi yapıldı");

	}

}
