package com.assignmentexception;
//9. WAP to show 3 different scenario in which null pointer exceptions generated,
//and handle that exception

public class ScenarioException9 {
	static void printLength(String str) {
        System.out.println("Length: " + str.length());
    }
	
	
	 public static void main(String[] args) {
	        String text = null;
	        try {
	            int length = text.length(); // This will generate a NullPointerException
	            System.out.println("Length: " + length);
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }
	        
	        
	        int[] numbers = null;
	        try {
	            int value = numbers[0]; // This will generate a NullPointerException
	            System.out.println("Value: " + value);
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }
	        
	        String text1 = null;
	        try {
	            printLength(text1); // This will generate a NullPointerException
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }
	    }
}
