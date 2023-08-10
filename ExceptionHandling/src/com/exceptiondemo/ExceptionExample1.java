package com.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int num[]=new int[5];
		int len=num.length,i;
		Scanner sc=new Scanner(System.in);
		
		try {
			
			for(i=0;i<len;i++)
			{
				System.out.println("Enter Element");
				num[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input mismatch message");
		}
		
		System.out.println("-----Array------");
		for(i=0;i<len;i++)
		{
			System.out.println(num[i]);
		}
	}

}
