package JAVASCANNER;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your temp:");
		double temp = sc.nextDouble();
		 System.out.println("Enter your name:");
		 String name = sc.next();
		System.out.println("Enter any character:");
		char c = sc.next().charAt(0);
		
		    System.out.println("your Age ="+age);
			System.out.println("your Name ="+name);
			System.out.println("your temperature="+temp);
	       System.out.println("your character ="+c);
	       sc.close();
	}
	

} 
