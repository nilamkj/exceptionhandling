package com.exceptiondemo;

import java.io.FileWriter;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) {
		
		FileWriter fw=null;
		try {
			fw=new FileWriter("myfill.txt");
			String data="java is my favourite language";
			fw.write(data);
			System.out.println("file created");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fw.close();
				}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
