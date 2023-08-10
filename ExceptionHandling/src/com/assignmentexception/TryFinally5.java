package com.assignmentexception;
//5. WAP where only try and finally is used

public class TryFinally5 {

	public static void main(String[] args) {

		try {
			String name = "Finally Block";
			System.out.println("Name :" + name);
		}

		finally {
			System.out.println("Always executes");
		}
		System.out.println("End");
	}

}
