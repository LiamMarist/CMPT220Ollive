package package9;

import java.util.Scanner;

// can make a custom exception by extending Exception class
public class IllegalTriangleException extends Exception{
	
	private double side1;
	private double side2;
	private double side3;
	
	//This constructs the exception
	public  IllegalTriangleException(double side1, double side2, double side3) {
		super ("Illegal Triangle " + side1 + side2 + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
		
	

	}


