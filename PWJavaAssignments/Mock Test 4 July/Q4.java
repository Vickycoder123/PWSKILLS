package Test;

public class Q4 {
	/*
	 * 4. Write a Java program to find the largest of three numbers using nested
	 * if-else statements.
	 */
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 50;
		int num3 = 20;

		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " num1 is greater");
		else if (num2 > num3)
			System.out.println(num2 + " num2 is greater");
		else
			System.out.println(num3 + " num3 is greater");
	}
}
