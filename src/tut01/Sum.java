package tut01;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		// Input would be like: "10 20 30 40".
		System.out.println("Enter integers separated by spaces:");
		
		// Instantiate a scanner object for standard input.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		// Read the whole line.
		String numbers = sc.nextLine();
		// Split it by space, now we have an array of numbers
		// but stored as String
		String[] no = numbers.split(" ");
		
		for (int i = 0; i < no.length; i++) {
			// Parse the String to Integer.
			sum += Integer.parseInt(no[i]);
		}
		
		System.out.println("Sum = " + sum);
		sc.close();
	}
}
