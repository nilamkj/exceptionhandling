package com.exceptiondemo;

public class CompileTimeException2 {

	public static void main(String[] args) {
		
		System.out.println("----Start----");
		
		try {
			Class clsname=Class.forName("com.exceptiondemo.ExceptionExample");
			System.out.println("Class name:"+clsname);
			}
		catch(ClassNotFoundException e)
		{
			System.out.println("Please check name of class");
		}
		System.out.println("---End-----");

	}

}
