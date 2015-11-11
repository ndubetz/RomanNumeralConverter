package main;

import java.util.Stack;

public class RomanNumeralToArabicNumberConverter {

	private Stack<Character> romanNumeralAsStackOfCharacters;

	public int convertToArabicNumber(String romanNumeralToConvert) {
		int convertedNumber = 0;
		
		romanNumeralAsStackOfCharacters = convertToStackOfCharacters(romanNumeralToConvert);
		
		while(!romanNumeralAsStackOfCharacters.isEmpty()){
			convertedNumber += parseCharIntoIntAndSubtractIfNecessary(romanNumeralAsStackOfCharacters);
		}

		return convertedNumber;
	}
	
	private Stack<Character> convertToStackOfCharacters(String romanNumeralToConvert){
		char[] romanNumeralChars = romanNumeralToConvert.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (Character character : romanNumeralChars) {
			stack.push(character);
		}
		
		return stack;
	}

	private int parseCharIntoIntAndSubtractIfNecessary(Stack<Character> stackOfChars) {
		Character romanNumeral = romanNumeralAsStackOfCharacters.pop();
		if (romanNumeral == 'C'){
			return actuallyParseNumeralToIntegerAndSubtractIfNecessary('X', 100, 10);
		} 
		else if (romanNumeral == 'L'){
			return actuallyParseNumeralToIntegerAndSubtractIfNecessary('X', 50, 10);
		}
		else if (romanNumeral == 'X'){
			return actuallyParseNumeralToIntegerAndSubtractIfNecessary('I', 10, 1);
		} 
		else if (romanNumeral == 'V'){
			return actuallyParseNumeralToIntegerAndSubtractIfNecessary('I', 5, 1);
		}
		else{
			return 1;
		}
	}
	
	private int actuallyParseNumeralToIntegerAndSubtractIfNecessary(char subtractingChar, 
			int valueOfNumeral, int valueToSubtract){
		if (!romanNumeralAsStackOfCharacters.isEmpty() && romanNumeralAsStackOfCharacters.peek() == subtractingChar){
			romanNumeralAsStackOfCharacters.pop();
			return valueOfNumeral - valueToSubtract;
		}
		else{
			return valueOfNumeral;
		}
	}
}
