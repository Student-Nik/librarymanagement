package com.collectionframework;

import java.util.Scanner;

public class Library {
	
	public static void main(String[] args) {
		
		BookOperation bo=new BookOperation();
		BorrowerOperation bo1=new BorrowerOperation();
		Operation o=new Operation();
		Scanner sc=new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("Welcome to Library Management System");
		System.out.println("==========================================");
		while(true) {
			System.out.println("*************MENU*****************");
			System.out.println("Press 1 for set Book\nPress 2 for see Book\nPress 3 for set Borrower\nPress 4 for see Borrower\nPress 5 for issue book\nPress 6 for submit Book");
			System.out.println("**********************************");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1: bo.setNewBook();
				 break;
			case 2: bo.getAllBookList();
				break;
			case 3: bo1.setNewBorrower();
				break;
			case 4: bo1.getAllBorrower();
				break;
			case 5: o.issueBook();
				break;
			case 6: o.submitBook();
				break;
			}
		}
	}

}
