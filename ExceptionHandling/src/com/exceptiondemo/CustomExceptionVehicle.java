package com.exceptiondemo;

import java.util.Scanner;

class VehicleSpeedException extends RuntimeException
{
	public VehicleSpeedException(String msg)
	{
		super(msg);
	}
}
class VehicleSpeed
{
	public void checkVehicleSpeed(int vehicleSpeed)
	{
		if(vehicleSpeed>80)
		{
			throw new VehicleSpeedException("Your speed is correct");
		}else
		{
			System.out.println("Please check your vehicle speed");
		}
	}
}
public class CustomExceptionVehicle {

	public static void main(String[] args) {
		
		System.out.println("Enter Vehicle speed of your vehicle: ");
		Scanner sc=new Scanner(System.in);
		int vehicleSpeed=sc.nextInt();
		VehicleSpeed book=new VehicleSpeed();
		try {
			book.checkVehicleSpeed(vehicleSpeed);
		}
		catch(VehicleSpeedException e)
		{
			System.out.println("Message: "+e.getMessage());
		}
		System.out.println("Thank you ..Safe Driving");
	}

	}


