package main;

import junit.framework.TestCase;

public class RomanNumeralToArabicNumberConverterTest extends TestCase {
	
	public void testConvert_CanConvertNumeralsLessThanX() throws Exception {
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
			= new RomanNumeralToArabicNumberConverter();
		String [] romanNumeralsToConvert = {"II", "IV", "VI", "VIII", "IX"};
		int[] expectedArabicNumbers = {2,4,6,8,9};

		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
				romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumeralsLessThanL() throws Exception {
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
		= new RomanNumeralToArabicNumberConverter();
		String [] romanNumeralsToConvert = {"XIV", "XXXIII", "XLI", 
				"XLIV", "XLIX"};
		int[] expectedArabicNumbers = {14,33,41,44,49};
		
		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
					romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumeralsLessThanC() throws Exception {
		RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter 
		= new RomanNumeralToArabicNumberConverter();
		String [] romanNumeralsToConvert = {"LIV", "LXXIX", "LXXXVII", "XCIV", "XCIX"};
		int[] expectedArabicNumbers = {54,79,87,94,99};
		
		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
					romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
}
