package com.exceptiondemo;

import java.util.Scanner;

class BookNotFoundException1 extends Exception {
		
		public BookNotFoundException1(String msg)
		{
			super(msg);
		}
	}
		class PurchaseBook1
		{
			public static void checkBookId(int bookId) throws BookNotFoundException1
			{
				if(bookId<101 || bookId>551)
				{
					throw new BookNotFoundException1("please check your bookid one!!!");
				}
				else
				{
					System.out.println("Your Book Found!!! please pay at cash counter");
				}
			}
		}

		public class CustomException2{
		
		public static void main(String[] args) {
			System.out.println("----welcome to BookYourBook");
			System.out.println("Enetr book id from purchasing book:101 to 551");
			Scanner sc=new Scanner(System.in);
			int bookId=sc.nextInt();
			PurchaseBook1 book=new PurchaseBook1();
			try {
				book.checkBookId(bookId);
			}
			catch(BookNotFoundException1 e)
			{
				System.out.println("Message: "+e.getMessage());
			}
			System.out.println("Thank you ..Keep Shopping");
		}

	}


