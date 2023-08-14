package com.assignmentexception;
//14. WAP to check whether Unchecked Exception is propagated in calling stack
public class UncheckedException14 {

	public static void main(String[] args) {
		
	        try {
	            method1();
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	        }
	    }
	    
	    public static void method1() {
	        System.out.println("Inside method1");
	        method2();
	    }
	    
	    public static void method2() {
	        System.out.println("Inside method2");
	        String str = null;
	        System.out.println(str.length()); // This line will throw NullPointerException
	    }

	}


