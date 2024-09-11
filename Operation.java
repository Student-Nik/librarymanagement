package com.collectionframework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Operation {
	//       https://docs.aws.amazon.com/ebs/latest/userguide/ebs-volume-types.html
	static Scanner sc=new Scanner(System.in);
	static List<Book> allList = BookOperation.bookList;
	static List<Borrower> borrowerList = BorrowerOperation.borrowerList;
	
	public static void issueBook() {
//		List<Book> allList = BookOperation.bookList;
//		List<Borrower> borrowerList = BorrowerOperation.borrowerList;
		
		System.out.println("Enter Borrower Id:");
		int borrowerId=sc.nextInt();
		
		Iterator<Borrower> borrowers = borrowerList.iterator();
		boolean found=false;
		Borrower borrower=null;
		while(borrowers.hasNext()) {
			borrower = borrowers.next();
			if(borrower.getBorrowerId() == borrowerId) {
				found=true;
				break;
			}
	    }
		if(found) {
			System.out.println("Enter Book Id:");
			int bookId=sc.nextInt();
			
			Iterator<Book> allBooks=allList.iterator();
			
			while(allBooks.hasNext()) {
				Book book=allBooks.next();
				
				if(book.getId()==bookId) {
					LocalDate localdate=LocalDate.now();
					book.setIssueDate(localdate);
					borrower.setBook(book);
					System.out.println("Book issued");
				    book.setStock(book.getStock()-1);
			}
			}
		}else {
			System.out.println("borrower not found");
		}
	}

	public static void submitBook() {
		System.out.println("Enter Borrower Id:");
		int borrowerId=sc.nextInt();
		
		Iterator<Borrower> borrowers = borrowerList.iterator();
		boolean found=false;
		Borrower borrower=null;
		while(borrowers.hasNext()) {
			borrower = borrowers.next();
			if(borrower.getBorrowerId() == borrowerId) {
				found=true;
				break;
			}
	    }
		
		if(found) {
			System.out.println("Borrower Name:"+borrower.getBorrowerName());
			System.out.println("Borrower City:"+borrower.getCity());
			System.out.println("Book Count:"+borrower.getBookCount());
			System.out.println("Book issued to borrower");
			Book book = borrower.getBook();
			System.out.println("Book Id:"+book.getId());
			System.out.println("Book Name:"+book.getName());
			System.out.println("Book Stock:"+book.getStock());
			System.out.println("Book Price:"+book.getPrice());
			System.out.println("Book Issue Date:"+book.getIssueDate());
			
			book.setSubmitDate(LocalDate.now());
			
			long days=ChronoUnit.DAYS.between(book.getIssueDate(), book.getSubmitDate());
			
			if(days>15) {
				long totalDays=days-15;
				int fine=(int) (totalDays*10);
				book.setFine(fine);
			}
		}
	}
}
