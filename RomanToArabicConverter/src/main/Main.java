package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Roman Numeral to Arabic Number Converter:\n");
		mainLoop();
		System.out.println("\nGoodbye!\n");
		System.exit(0);
	}

	private static void mainLoop(){
		Scanner scanner = new Scanner(System.in);
		
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
			= new RomanNumeralToArabicNumberConverter(new RomanNumeralValidator());

		System.out.println("Enter a valid Roman Numeral.\nPress 'Q' to quit.");
		
		String userInput = scanner.next();
		
		while(!userInput.toUpperCase().equals("Q")){
			System.out.println(romanNumeralToArabicNumberConverter.convertToArabicNumber(userInput));
			
			System.out.println("Enter another valid Roman Numeral.\nPress 'Q' to quit.");
			userInput = scanner.next();
		}
		
		scanner.close();
	}
}
