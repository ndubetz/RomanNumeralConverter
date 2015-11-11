package main;

import junit.framework.TestCase;

public class RomanNumeralToArabicNumberConverterTest extends TestCase {
	
	public void testConvert_CanConvertNumbersLessThan100() throws Exception {
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
			= new RomanNumeralToArabicNumberConverter();
		String [] romanNumeralsToConvert = {"II", "IV", "VI", "VIII", "IX", "XIV", "XXXIII", "XLI", 
				"XLIV", "XLIX", "LIV", "LXXX", "LXXXVII", "XCIV", "XCIX"};
		int[] expectedArabicNumbers = {2,4,6,8,9,14,33,41,44,49,54,80,87,94,99};

		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
				romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
}
