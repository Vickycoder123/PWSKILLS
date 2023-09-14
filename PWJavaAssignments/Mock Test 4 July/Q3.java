package Test;

import java.util.Scanner;

public class Q3 {
	/*
	 * 3. Write a Java program to calculate the average of a list of numbers using a
	 * do-while loop.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int num;

		System.out.println("Enter numbers to get average : ");
		System.out.println("-Enter -1 to stop-");
		do {
			num = sc.nextInt();
			if (num != -1) {
				sum += num;
				count++;
			}
		} while (num != -1);

		sc.close();

		if (count > 0) {
			double average = (double) sum / count;
			System.out.println(average);
		} else {
			System.out.println("Please enter some numbers !");
		}
	}
}
