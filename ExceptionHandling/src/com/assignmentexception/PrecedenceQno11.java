package com.assignmentexception;
//11.WAP to return int value in try block and return int value in finally block 
//and observe which return takes precedence
//12. WAP to return int value in try and return int value in finally and see finally takes precedence. 
public class PrecedenceQno11 {
	public static int getValueFromTry() {
        try {
            System.out.println("Inside try block");
            return 10;  // This return statement will take precedence
        } finally {
            System.out.println("Inside finally block");
            return 20;  // This return statement will be ignored
        }
    }

    public static void main(String[] args) {
        int result = getValueFromTry();
        System.out.println("Returned value: " + result);
    }
}
