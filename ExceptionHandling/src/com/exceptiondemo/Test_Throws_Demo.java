package com.exceptiondemo;

import java.io.IOException;
/*An exception propagation is occurs when an exception thrown from the top of the stack. 
 * An exception is first thrown from the stack and if it is no caught 
 * it drops down the call stack to previous method.
 * if not caught there, the exception again drop down to previous method.
 * */

public class Test_Throws_Demo {

	public void m1() throws IOException,ClassNotFoundException
	{
		System.out.println("Code----");
	}
	public void m2()throws IOException,ClassNotFoundException
	{
		m1();
	}
	public void m3()
	{
		try {
			m2();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		Test_Throws_Demo t=new Test_Throws_Demo();
		t.m3();
	}

}
