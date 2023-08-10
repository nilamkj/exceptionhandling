package com.exceptiondemo;
//Default exception handler
public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Start");
		int a=10;
		//int b=0;  //default exception when div=a/b; b=0
		int b=2;
		try
		{
			int	div=a/b;
			System.out.println("Division: "+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error");
		}
		System.out.println("Thank you");
		System.out.println("End");
	}

}
