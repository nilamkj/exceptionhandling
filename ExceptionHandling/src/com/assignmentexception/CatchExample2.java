package com.assignmentexception;
//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception

public class CatchExample2 {

	public static void main(String[] args) {
		int num[]= {56,47,23,81,50};
		
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
			
			e.printStackTrace();//class name,description and line number
		}
		System.out.println("End");
	}

	}


