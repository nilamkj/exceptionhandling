package com.exceptiondemo;
//try-finally
//try-catch-finally
public class FinallyBlock {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int div=a/b;
			System.out.println("Div :"+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Always executes");
		}
		System.out.println("End");
	}

}
