import java.util.Scanner;

//Q. Write a simple String program to take input from the user?

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name...");
		String name = sc.next();
		System.out.println("Hello, "+name);
		sc.close();
	}

}