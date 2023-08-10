package com.exceptiondemo;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		String name=null;
		int num[]= {4,5,6};
		int a=10;
		int b=2;
		
		try {
			int div= a/b;
			System.out.println("div: "+div);
			System.out.println("array: "+num[0]);
			System.out.println(name.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please do not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please check index number");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime Exception");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());  //general exception block
		}
		System.out.println("Rest of the code");

	}

}
