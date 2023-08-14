package com.exceptiondemo;

import java.util.Scanner;

class BookNotFoundException extends RuntimeException {
	
	public BookNotFoundException(String msg)
	{
		super(msg);
	}
}
	class PurchaseBook
	{
		public static void checkBookId(int bookId)
		{
			if(bookId<101 || bookId>551)
			{
				throw new BookNotFoundException("please check your bookid one!!!");
			}
			else
			{
				System.out.println("Your Book Found!!! please pay at cash counter");
			}
		}
	}

public class CustomExceptionBookNF{
	
	public static void main(String[] args) {
		System.out.println("----welcome to BookYourBook");
		System.out.println("Enetr book id from purchasing book:101 to 551");
		Scanner sc=new Scanner(System.in);
		int bookId=sc.nextInt();
		PurchaseBook book=new PurchaseBook();
		try {
			book.checkBookId(bookId);
		}
		catch(BookNotFoundException e)
		{
			System.out.println("Message: "+e.getMessage());
		}
		System.out.println("Thank you ..Keep Shopping");
	}

}

