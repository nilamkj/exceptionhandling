package com.exceptiondemo;

import java.io.IOException;

public class Throw_Throws_Keyword {
	public void checkAge(int age) throws IOException
	{
		if(age<35)
		{
		//explicitly throw exception
		throw new IOException("Candidate is not eligible for this designation");
	}else
	{
		System.out.println("Welcome.. please fill the form details");
	}
	}
	public static void main(String[] args) {
		System.out.println("----start----");
		Throw_Throws_Keyword d=new Throw_Throws_Keyword();
		try {
			d.checkAge(15);
			}
		catch(IOException e){
			System.out.println("Message:"+e.getMessage());		
		}
		System.out.println("----End---");

	}

}
