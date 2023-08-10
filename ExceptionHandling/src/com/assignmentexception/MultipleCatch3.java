package com.assignmentexception;
//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and
//ArithmeticException

public class MultipleCatch3 {

	public static void main(String[] args) {
		try
		{
			int num[]= {11,22,33};
			int index=5;
			int result=num[index]/0;
			System.out.println("Result: "+result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception:Division by zero");
		}
		catch(Exception e)
		{
			System.out.println("An error occurred: "+e.getMessage());
		}
	}
}
