package com.assignmentexception;

import java.io.IOException;

//17. WAP to show throw and throws keyword.
public class Throw_Throws17 {
		public static void checkAge(int age)throws IOException
		{
			if(age<40)
			{
				throw new IOException("Candidate not eligible for this designation");
			}
			else
			{
				System.out.println("Please, fill the form");
			}
		}
	
	public static void main(String[] args)
	{
		Throw_Throws17 t=new Throw_Throws17();
		try
		{
			t.checkAge(45);
		}
		catch(Exception e)
		{
			System.out.println("Message: "+e.getMessage());
		}

	}

}
