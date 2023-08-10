package com.exceptiondemo;

public class ExceptionPropagation {
	public static void m1()
	{
		System.out.println(10/0);
	}
	public static void m2()
	{
		m1();
	}
	public static void m3()
	{
		m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println("---Start---");
		System.out.println("---End---");
	}

}
