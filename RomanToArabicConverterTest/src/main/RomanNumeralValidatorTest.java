package main;

import junit.framework.TestCase;

public class RomanNumeralValidatorTest extends TestCase{
	
	private RomanNumeralValidator romanNumeralValidator;
	
	@Override
	protected void setUp() throws Exception {
		romanNumeralValidator = new RomanNumeralValidator();
		super.setUp();
	}

	public void testValidate_ReturnsTrueForValidRomanNumerals_RegressionTest() throws Exception {
		String[] romanNumeralsToValidate = {"MMXV", "MCMXLIX", "MMMCCCXXXIII", "DLV", "MDCLXVI", "I", "MMMCMXCIX"};
		
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[0]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[1]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[2]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[3]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[4]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[5]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[6]));
	}
	
	public void testValidate_ReturnsFalseIfIllegalCharacterInString_OrEmptyString() throws Exception {
		String[] illegalRomanNumeralsToValidate = {"XXB", "X1M", "MMM0", "ABC", ""};
		
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[0]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[1]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[2]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[3]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[4]));
	}
	
	public void testValidate_ConvertsToUppercaseBeforeAttemptingToValidate() throws Exception {
		String[] romanNumeralsToValidate = {"xiv", "cmLxXxiv", "Cd", "dCi"};
		
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[0]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[1]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[2]));
		assertTrue(romanNumeralValidator.isAValidRomanNumeral(romanNumeralsToValidate[3]));
	}
	
	public void testValidate_ReturnsFalseIfThereTooManyOnesSymbols() throws Exception {
		String[] illegalRomanNumeralsToValidate = {"MMMM", "XXXX", "CCCC", "IIII"};
		
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[0]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[1]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[2]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[3]));
	}
	
	public void testValidate_ReturnsFalseIfThereTooManyFiveSymbols() throws Exception {
		String[] illegalRomanNumeralsToValidate = {"MMVV", "LL", "DD", "DLVV"};
		
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[0]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[1]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[2]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[3]));
	}
	
	public void testValidate_ReturnsFalseIfThereIllegalSubtractions() throws Exception {
		String[] illegalRomanNumeralsToValidate = {"MMIIV", "LIL", "CID", "MIM", "XXL", "DM"};
		
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[0]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[1]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[2]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[3]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[4]));
		assertFalse(romanNumeralValidator.isAValidRomanNumeral(illegalRomanNumeralsToValidate[5]));
	}
}
