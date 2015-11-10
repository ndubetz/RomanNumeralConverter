package main;

import junit.framework.TestCase;

public class ArabicToRomanNumberConverterTest extends TestCase{
	
	public void testConvert_CanConvertNumbersThatAreLessThan5() throws Exception {
		ArabicToRomanNumberConverter arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
		
		int numberToConvert1 = 3;
		String expectedRomanNumeral1 = "III";
		assertEquals(expectedRomanNumeral1, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert1));
		
		int numberToConvert2 = 4;
		String expectedRomanNumeral2 = "IV";
		assertEquals(expectedRomanNumeral2, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert2));
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan10() throws Exception {
		ArabicToRomanNumberConverter arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
		
		int numberToConvert1 = 5;
		String expectedRomanNumeral1 = "V";
		assertEquals(expectedRomanNumeral1, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert1));
		
		int numberToConvert2 = 7;
		String expectedRomanNumeral2 = "VII";
		assertEquals(expectedRomanNumeral2, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert2));
		
		int numberToConvert3 = 9;
		String expectedRomanNumeral3 = "IX";
		assertEquals(expectedRomanNumeral3, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert3));
	}
}
