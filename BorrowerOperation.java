package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BorrowerOperation {
	
	static List<Borrower> borrowerList = new ArrayList<>();

	static Scanner sc=new Scanner(System.in);
	
	public void setNewBorrower() {
		boolean registrationDone=true;
		
		while(registrationDone) {
			System.out.println("Enter Borrower Id:");
			int id=sc.nextInt();
			
			System.out.println("Enter Borrower Name:");
			String name=sc.next();
			
			System.out.println("Enter Borrower City:");
			String city = sc.next();
			
			Borrower bo=new Borrower();
			bo.setBorrowerId(id);
			bo.setBorrowerName(name);
			bo.setCity(city);
			
			borrowerList.add(bo);
			
			System.out.println("Press 1 for done registration\nPress any other key for continue registration");
		    if(sc.nextInt() == 1) {
		    	registrationDone=false;
		    }
		}
	}
	
	public void getAllBorrower() {
		Iterator<Borrower> itr = borrowerList.iterator();
		while(itr.hasNext()) {
			Borrower borrower = itr.next();
			System.out.println(borrower.getBorrowerId());
			System.out.println(borrower.getBorrowerName());
			System.out.println(borrower.getCity());
			System.out.println(borrower.getBookCount());
			try {
			Book book = borrower.getBook();
			
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getStock());
			System.out.println(book.getPrice());
			System.out.println(book.getFine());
			System.out.println(book.getIssueDate());
			System.out.println(book.getSubmitDate());
			}catch(NullPointerException e) {
				System.out.println("Book not issued yet");
			}
			
	}
	}
//	public static void main(String[] args) {
//		
//		BorrowerOperation  bo = new BorrowerOperation();
//		while(true) {
//			System.out.println("Press 1 for set Borrower\nPress 2 for see all borowwer");
//			int ch=sc.nextInt();
//			
//			if(ch==1) {
//				bo.setNewBorrower();
//			}
//			else {
//				bo.getAllBorrower();
//				}
//			}
//		}
	}

