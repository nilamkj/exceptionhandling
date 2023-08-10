package com.assignmentexception;
//7. WAP to check can we have an empty catch block

public class EmptyCatch7 
{
	public static void main(String[] args) 
	{
	 try {
         int result = 10 / 0; // This will throw an ArithmeticException
     } 
	 catch (ArithmeticException e)
	 {
         // Empty catch block
     }
     
     System.out.println("Program completed.");
 }
}
