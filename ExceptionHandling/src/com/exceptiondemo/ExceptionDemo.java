package com.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num[]= {45,78,88,98,40};
		
		int len=num.length,i;
		
		try {
			for(i=0;i<=len;i++)
			{
				System.out.println(num[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check array index value");
			System.out.println(e);//class name and message
			System.out.println("message: "+e.getMessage());
			System.out.println("class: "+e.getClass());
			e.printStackTrace();//class name,description and line number
		}
		System.out.println("End");
	}

}
