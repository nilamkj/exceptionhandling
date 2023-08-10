package com.exceptiondemo;

public class ExceptionMethodApproch {
	public static void exceptionMethodApproch()
	{
		int a=10;
		int b=0;
		try {
			int div=a/b;
			System.out.println("Div :"+div);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("In main method");
		exceptionMethodApproch();
		System.out.println("End");

	}

}
