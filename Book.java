// Book class

package com.collectionframework;

import java.time.LocalDate;

public class Book {
	
	private int id;
	private String name;
	private int price;
	private int stock;
	private int fine;
	private LocalDate issueDate;
	private LocalDate submitDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	public Book(int id, String name, int price, int stock, int fine, LocalDate issueDate, LocalDate submitDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.fine = fine;
		this.issueDate = issueDate;
		this.submitDate = submitDate;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", fine=" + fine
				+ ", issueDate=" + issueDate + ", submitDate=" + submitDate + "]";
	}
	
	
	
}
