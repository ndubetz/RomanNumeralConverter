package main;

import junit.framework.TestCase;

public class RomanNumeralToArabicNumberConverterTest extends TestCase {
	
	public void testConvert_CanConvertNumbersLessThanX() throws Exception {
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
			= new RomanNumeralToArabicNumberConverter();
		String [] romanNumeralsToConvert = {"II", "IV", "VI", "VIII", "IX"};
		int[] expectedArabicNumbers = {2,4,6,8,9};

		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
				romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
}
