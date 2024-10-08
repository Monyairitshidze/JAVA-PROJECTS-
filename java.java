package java1;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		
		//simple calculator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int addition = num1+num2;
		int substraction = num1-num2;
		int devision = num1/num2;
		int multiplication = num1*num2;
		
		System.out.println("Addition: " +addition);
		System.out.println("Substraction: " +substraction);
		System.out.println("Devision: " +devision);
		System.out.println( "Multiplication: " +multiplication);
		
		// age checker
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("User is not allowed to vote.");
		}
		else {
			System.out.println("User is  allowed to vote.");
		}
		
		
		//simple interest calculator
		System.out.println("Enter the principal amout: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter time: ");
		double time = sc.nextDouble();
		
		double interest = (principal*rate*time)/100;
		
		System.out.println(interest);
		
		//area of the circle
		
		double PIE = Math.PI;
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		
		double area = PIE*radius*radius;
		
		System.out.println(area);
		
		
		sc.close();
		
	}
}
