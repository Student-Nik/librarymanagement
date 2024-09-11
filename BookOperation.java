package com.collectionframework;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookOperation {
	
	static List<Book> bookList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public void setNewBook() {
		boolean purchaseBook=true;
		
		while(purchaseBook) {
			System.out.println("Enter Book Id:");
			int id=sc.nextInt();
			
			System.out.println("Enter Book Name:");
			String name=sc.next();
			
			System.out.println("Enter Book Price:");
			int price=sc.nextInt();
			
			System.out.println("Enter Book Stock:");
			int stock=sc.nextInt();
			
//			System.out.println("Enter Issue Date:");
//			String issueDate=sc.next();
			
//			System.out.println("Enter Submit Date:");
//			String submitDate=sc.next();
			
			Book bk=new Book();
			bk.setId(id);
			bk.setName(name);
			bk.setPrice(price);
			bk.setStock(stock);
//			bk.setIssueDate(issueDate);
			//bk.setSubmitDate(submitDate);
			
			bookList.add(bk);
			
			System.out.println("Press 1 for stop purchase\nPress 2 for continue");
			if(sc.nextInt()==1) {
				purchaseBook=false;
			}
		}
	}
	
	public void getAllBookList() {
		Iterator<Book> itr= bookList.iterator();
		while(itr.hasNext()) {
			Book book = itr.next();
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getPrice());
			System.out.println(book.getStock());
			//System.out.println(book.getIssueDate());
			//System.out.println(book.getSubmitDate());
	}
	}
		
//	public static void main(String[] args) {
//		
//		BookOperation bk=new BookOperation();
//		while(true) {
//			System.out.println("Press 1 for set Book\nPress 2 for see all books");
//			int ch=sc.nextInt();
//			
//			if(ch==1) {
//				bk.setNewBook();
//			}else {
//			     bk.getAllBookList();
//				}
//			}
//		}
	}


