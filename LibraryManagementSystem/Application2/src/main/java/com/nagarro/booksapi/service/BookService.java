package com.nagarro.booksapi.service;

import java.util.List;

import com.nagarro.booksapi.entity.Book;

public interface BookService {
	public List<Book> findAll();

	public Book findByCode(int bookCode);

	public void addBook(Book book);

	public void deleteBook(int bookCode);
}
