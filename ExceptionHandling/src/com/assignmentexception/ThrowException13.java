package com.assignmentexception;
//13. WAP to check what happen when Exception is thrown by main method
public class ThrowException13 {

	public static void main(String[] args) {
		  try {
	            // This line will throw an ArithmeticException because of division by zero
	            int result = 10 / 0;
	            System.out.println("Result: " + result); // This line will not be executed
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception: " + e);
	        }
	    }

	}


