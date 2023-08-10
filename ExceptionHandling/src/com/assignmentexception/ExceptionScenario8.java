package com.assignmentexception;
//8. WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound
//and StringIndexOutOfBound) exception is generated and handle this exception

public class ExceptionScenario8 {

	 public static void main(String[] args) {
	        // Scenario 1: ArrayIndexOutOfBoundsException
	        try {
	            int[] numbers = { 1, 2, 3 };
	            System.out.println(numbers[3]); // Accessing index 3 which is out of bounds
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }

	        // Scenario 2: StringIndexOutOfBoundsException
	        try {
	            String text = "Hello";
	            System.out.println(text.charAt(10)); // Accessing index 10 which is out of bounds
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	    }
}
