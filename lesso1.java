package myPackage;

import java.util.Scanner;

public class lesso1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*//calculator using switch statement
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Choose your operators: ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
		System.out.println(num1+num2);
		break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
		case 4:
			System.out.println(num1/num2);
			break;
		default:
		System.out.println("wrong input");
		
		
		//find the maximum of two numbers
		System.out.println("Enter first number: ");
		int numb1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int numb2 = sc.nextInt();
		
		int result = (numb1>numb2)? numb1:numb2;
		System.out.println(result);
		
		//odd or even checker
		System.out.println("Enter first number: ");
		int numbe1 = sc.nextInt();
		
		if(numbe1 %2 ==0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is  not even.");
		}
		
		//grade calculator nested if and ternary operator
		
		System.out.println("Enter student score: ");
		int score = sc.nextInt();
		
		if(score>=90 &&score<=100) {
			System.out.println("A");
		}
		else if(score>=80 &&score<90) {
			System.out.println("B");
		}
		else if(score>=70 &&score<80) {
			System.out.println("C");
		}
		else if(score>=60 &&score<70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		// multiplication generator
		
		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();
		
		int times =0;
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(times*i);
			
			if(i==5) {
				continue;
			}
		}
		
		//find the posetive number in an array
		
		int array[] = {3,6,9,4,6,25,0,1};
		
		for(int i=0; i<array.length; i++) {
			
			int result1 =array[i];
			
			if(!(result >= 0)) {
				continue;
			}
			else {
				System.out.println(result1);
			}
		}*/
		
		//simple ATM simulation
		System.out.println("Choose your operators: ");
		System.out.println("1. Deposit: ");
		System.out.println("2. WithDraw: ");
		System.out.println("3. Balance Check: ");
		System.out.println("Enter ypur Choice: ");
		int choice1 = sc.nextInt();
		
		double balance = 305.00;
		
		switch(choice1) {
		
		case 1:
			System.out.println("Enter the amount: ");
			int amount = sc.nextInt();
		double updatedAmount = balance+ amount;
		balance = updatedAmount;
		System.out.println("Available amount: " + balance);
		break;
		case 2:
			System.out.println("Enter the amount you want to withdraw: ");
			int withdrawal = sc.nextInt();
			double currentBalance = balance - withdrawal;
			balance = currentBalance;
			System.out.println("Available amount: " + balance);
			break;
			default:
				System.out.println("Available amount: " + balance);
			
		}
		
		
		
		}
	}

