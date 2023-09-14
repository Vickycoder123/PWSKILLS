package Test;

import java.util.Scanner;

public class Q1 {
	/*
	 * 1. Write a Java program to check whether a given number is positive,
	 * negative, or zero using an if-else statement.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();

		if (num > 0)
			System.out.println("Positive");
		else if (num < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}
