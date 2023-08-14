package com.assignmentexception;

import java.io.IOException;

//15. WAP to check whether Checked Exception is propagated in calling stack 
public class CheckedException15 {
	 static void method1() throws IOException 
	{
		System.out.println("Inside method 1");
		 method2();
	}
	static void method2()throws IOException 
	{
		System.out.println("Inside method 2"); 
		method3();
	}
	static void method3() throws IOException 
	{
        throw new IOException("This is a checked exception");
	}   
        
	public static void main(String[] args) {
		 try {
	            method1();
	        } catch (IOException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	}

}
