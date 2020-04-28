package com.blbr.books.dto;

public class BooksDto {
	private String name;
	private String author;
	private Long price;
	private boolean isCart;
	private boolean isWishlist;
	private long count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public boolean isCart() {
		return isCart;
	}

	public void setCart(boolean isCart) {
		this.isCart = isCart;
	}

	public boolean isWishlist() {
		return isWishlist;
	}

	public void setWishlist(boolean isWishlist) {
		this.isWishlist = isWishlist;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
