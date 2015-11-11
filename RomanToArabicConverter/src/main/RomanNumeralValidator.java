package main;

import java.util.regex.Pattern;


public class RomanNumeralValidator {

	public boolean isAValidRomanNumeral(String romanNumeralToValidate) {
		String validCharacters = "[MDCLXVI]+";
		return Pattern.matches(validCharacters, romanNumeralToValidate.toUpperCase());
	}

}
