package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Arabic Number to Roman Numeral Converter:\n");
		mainLoop();
		System.out.println("\nGoodbye!\n");
		System.exit(0);
	}

	private static void mainLoop(){
		Scanner scanner = new Scanner(System.in);
		ArabicNumberValidator arabicNumberValidator = new ArabicNumberValidator();
		ArabicNumberToRomanNumeralConverter arabicNumberToRomanNumeralConverter = new ArabicNumberToRomanNumeralConverter();

		System.out.println("Enter an integer between 0 and 3,999.\nPress 'Q' to quit.");
		
		String userInput = scanner.next();
		
		while(!userInput.toUpperCase().equals("Q")){
			if(arabicNumberValidator.canBeConvertedToRomanNumeral(userInput)){
				System.out.println(arabicNumberToRomanNumeralConverter.convertToRomanNumeral(Integer.parseInt(userInput)));
			}else{
				System.out.println("Invalid input.");
			}
			
			System.out.println("Enter another integer between 0 and 3,999.\nPress 'Q' to quit.");
			userInput = scanner.next();
		}
		
		scanner.close();
	}
}
