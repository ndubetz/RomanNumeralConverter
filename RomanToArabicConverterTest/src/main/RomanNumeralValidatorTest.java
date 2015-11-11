package main;

import junit.framework.TestCase;

public class RomanNumeralValidatorTest extends TestCase{
	
	public void testValidate_ReturnsTrueForValidRomanNumerals_RegressionTest() throws Exception {
		RomanNumeralValidator romanNumeralValidator = new RomanNumeralValidator();
		
		String[] romanNumeralsToValidate = {"MMXV", "MCMXLIX", "MMMCCCXXXIII", "DLV", "MDCLXVI"};
		
		for(int i = 0 ; i < romanNumeralsToValidate.length; i++){
			assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[i]));
		}
	}
	
	public void testValidate_ReturnsFalseIfIllegalCharacterInString() throws Exception {
		RomanNumeralValidator romanNumeralValidator = new RomanNumeralValidator();
		
		String[] illegalRomanNumeralsToValidate = {"XXB", "X1M", "MMM0", "ABC", "@#$"};
		
		for(int i = 0 ; i < illegalRomanNumeralsToValidate.length; i++){
			assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[i]));
		}
	}
	
	public void testValidate_ConvertsToUppercaseBeforeAttemptingToValidate() throws Exception {
		RomanNumeralValidator romanNumeralValidator = new RomanNumeralValidator();
		
		String[] romanNumeralsToValidate = {"xiv", "cmLxXxiv", "Cd", "dCi"};
		
		for(int i = 0 ; i < romanNumeralsToValidate.length; i++){
			assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[i]));
		}
	}
}
