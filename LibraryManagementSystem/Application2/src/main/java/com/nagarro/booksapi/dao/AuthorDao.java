package com.nagarro.booksapi.dao;

import java.util.List;

import com.nagarro.booksapi.entity.Author;

public interface AuthorDao {
	public List<Author> findAll();
	public Author findBookByName(String name);
	public void delete(String name);
	public void save(Author author);
}
