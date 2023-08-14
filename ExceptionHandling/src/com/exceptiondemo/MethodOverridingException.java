package com.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent
{
	public void method1(int a)
	{
		System.out.println("a: "+a);
	}

	public void method2(double d)throws IOException,RuntimeException
	{
		System.out.println("data: "+d);
	}
}
class Child extends Parent
{
	//can not possible if superclass method does not throws any exception
	public void method1(int a)throws ArithmeticException
	{
		System.out.println("a: "+a);
	}
	public void method2(double d)throws FileNotFoundException,ArithmeticException
	{
		System.out.println("data: "+d);
	}
}
public class MethodOverridingException {
	

	public static void main(String[] args) {
		
	}

}
