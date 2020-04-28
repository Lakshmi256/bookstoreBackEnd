package com.blbr.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blbr.books.dto.BooksDto;
import com.blbr.books.response.BooksResponse;
import com.blbr.books.service.BookService;

import io.swagger.annotations.ApiOperation;

@RestController
public class BooksController {

	@Autowired
	private BookService bookService;

	/* Api for adding books details */
	@PostMapping("/books/add")
	@ApiOperation(value = "Api to add books details ", response = BooksResponse.class)

	public ResponseEntity<BooksResponse> add(@RequestBody BooksDto information, @ModelAttribute MultipartFile file) {
		return null;

	}
}
