package com.exceptiondemo;


public class Throw_Keyword {
	
		public void checkAge(int age) {
			if(age<35) {
				throw new ArithmeticException("Candidate is not eligble for this job");
			}
			else {
				System.out.println("Welcome....Please fill the form details");
			}
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("----Start----"); 
				Throw_Keyword d=new Throw_Keyword();
				try {
					d.checkAge(15);
				}
				catch(ArithmeticException e) {
					System.out.println("Message:"+ e.getMessage());
				}
				System.out.println("----End----");
			}

		}

