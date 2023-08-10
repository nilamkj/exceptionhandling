package com.exceptiondemo;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		System.out.println("\n1.Addition \n2.Substraction \n3.Multiply \n4.Division");
		int choice=sc.nextInt();
		System.out.println("Enter first value:");
		int a=sc.nextInt();
		System.out.println("Enter Second value:");
		int b=sc.nextInt();
		
		switch(choice)
		{
		case 1:int sum=cal.add(a,b);
				System.out.println("Addition: "+sum);
				break;
		case 2:int ans=cal.sub(a,b);
				System.out.println("Subtraction: "+ans);
				break;
		case 3:int ans1=cal.multiply(a,b);
				System.out.println("Multiply: "+ans1);
				break;
		case 4:int ans2=cal.add(a,b);
				System.out.println("Division: "+ans2);
				break;
				
		}

	}

}
