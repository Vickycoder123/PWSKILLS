package Test;

import java.util.Scanner;

public class Q2 {
	/*
	 * 2. Write a Java program to print the Fibonacci series up to a given number
	 * using a for loop.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();

		generateFibonacci(num);
	}

	private static void generateFibonacci(int num) {
		int num1 = 0, num2 = 1;
		while (num > 0) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			num--;
		}
	}
}