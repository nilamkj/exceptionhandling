package com.assignmentexception;
//1.WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace 
//and the line number from where the Exception is thrown

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int index=5;
		
		try {
			int value=arr[index];
			System.out.println("Value at index "+index+": "+value);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
