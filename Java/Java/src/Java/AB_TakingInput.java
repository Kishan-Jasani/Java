package Java;

import java.util.Scanner;

public class AB_TakingInput {
	public static void main(String[] args) {
		System.out.println("Taking Input from User with Scanner Class");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter Maths Marks out of 100: ");
		int a = sc.nextInt();
		System.out.print("Enter Physics Marks out of 100: ");
		int b = sc.nextInt();
		System.out.print("Enter Chemistry Marks out of 100: ");
		int c = sc.nextInt();
		float sum = a + b + c;
		System.out.println("Hi "+name+", Your Percentage is: "+ sum/3);
	}
}
