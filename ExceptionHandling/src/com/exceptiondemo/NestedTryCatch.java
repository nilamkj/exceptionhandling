package com.exceptiondemo;

public class NestedTryCatch {

	public static void main(String[] args) {
		String name=null;
		int num[]= {4,5,6};
		int a=10;
		int b=0;
		
		try {
			//try block 1
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			//block 2
			try {
				System.out.println(name.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
			//block 3
			try {
				System.out.println(num[6]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);	
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());  //general exception block
		}
		System.out.println("Rest of the code");
	}

}
