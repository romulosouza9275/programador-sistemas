package controller;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name:");
	String s1 = scan.nextLine();
	System.out.println("Your name is"+s1);
	
	System.out.println("City name");
	String s2 = scan.next();
	System.out.println("city is + s2");
	int x =scan.nextInt();
	
	System.out.println("Enter whole number:");
	
	System.out.println("Enter double value:");
	double y = scan.nextDouble();
	System.out.println("number are" + x + "and" + y + " and their product is " + (x*y));
	
    scan.close();
	
	System.out.println("the end");
}
}