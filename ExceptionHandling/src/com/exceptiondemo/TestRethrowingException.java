package com.exceptiondemo;

import java.io.IOException;

public class TestRethrowingException {
	public static void findLength(String str)throws IOException
	{
		try {
			System.out.println("Length of string: "+str.length());
		}
		catch(NullPointerException e)
		{
			throw new IOException("String does not have value");
		}
	}

	public static void main(String[] args) {
		String s=null;
		try {
				findLength(s);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
