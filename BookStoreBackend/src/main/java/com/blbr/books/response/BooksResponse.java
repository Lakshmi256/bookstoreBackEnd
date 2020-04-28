package com.blbr.books.response;

import java.util.List;

import com.blbr.books.model.BooksModel;

public class BooksResponse {

	private int statuscode;
	private BooksModel object;
	private String message;
	private List list;

	public BooksResponse(int statuscode, BooksModel object, String message) {
		super();
		this.statuscode = statuscode;
		this.object = object;
		this.message = message;  
	}

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public BooksModel getObject() {
		return object;
	}

	public void setObject(BooksModel object) {
		this.object = object;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
