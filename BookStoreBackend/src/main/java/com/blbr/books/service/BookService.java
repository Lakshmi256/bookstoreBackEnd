package com.blbr.books.service;

import com.blbr.books.dto.BooksDto;
import com.blbr.books.model.BooksModel;

public interface BookService {

	BooksModel addBook(BooksDto information);

}
