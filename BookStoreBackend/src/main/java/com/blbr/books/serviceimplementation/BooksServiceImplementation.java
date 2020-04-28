package com.blbr.books.serviceimplementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blbr.books.dto.BooksDto;
import com.blbr.books.model.BooksModel;
import com.blbr.books.repositroy.BooksRepository;
import com.blbr.books.service.BookService;

@Service
public class BooksServiceImplementation implements BookService {
	BooksModel booksModel = new BooksModel();
	@Autowired
	private BooksRepository bookRepository;

	@Override
	public BooksModel addBook(BooksDto information) {
		// TODO Auto-generated method stub
		BeanUtils.copyProperties(information, booksModel);
		bookRepository.save(booksModel);
		return null;
	}

}
