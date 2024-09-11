package com.collectionframework;

public class Borrower {
	
	private int borrowerId;
    private String borrowerName;
    private String city;
    private int bookCount;
    private Book book;
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Borrower(int borrowerId, String borrowerName, String city, int bookCount, Book book) {
		super();
		this.borrowerId = borrowerId;
		this.borrowerName = borrowerName;
		this.city = city;
		this.bookCount = bookCount;
		this.book = book;
	}
	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Borrower [borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + ", city=" + city
				+ ", bookCount=" + bookCount + ", book=" + book + "]";
	}
	
    
    
}
