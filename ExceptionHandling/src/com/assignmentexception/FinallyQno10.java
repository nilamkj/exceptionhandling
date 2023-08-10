package com.assignmentexception;
//10. WAP to throw exception still finally should get executed

public class FinallyQno10 {

	 public static void main(String[] args) {
	        try {
	            int result = divide(10, 0); // This will throw an exception
	            System.out.println("Result: " + result); // This won't be executed
	        } catch (ArithmeticException ex) {
	            System.out.println("Caught exception: " + ex.getMessage());
	        } finally {
	            System.out.println("Finally block executed");
	        }
	    }

	    public static int divide(int dividend, int divisor) {
	        return dividend / divisor;
	    }
}
