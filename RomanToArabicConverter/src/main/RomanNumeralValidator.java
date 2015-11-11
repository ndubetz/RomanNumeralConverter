package main;

import java.util.regex.Pattern;


public class RomanNumeralValidator {

	public boolean isAValidRomanNumeral(String romanNumeralToValidate) {
		String romanNumeralRegex = "M{0,3}(D{0,1}C{0,3}|CD{1}|CM{1})(L{0,1}X{0,3}|XL{1}|XC{1})(V{0,1}I{0,3}|IV{1}|IX{1})";
		return Pattern.matches(romanNumeralRegex, romanNumeralToValidate.toUpperCase()) && !romanNumeralToValidate.isEmpty();
	}

}
