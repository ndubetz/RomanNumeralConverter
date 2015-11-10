package main;

import junit.framework.TestCase;

public class ArabicToRomanNumberConverterTest extends TestCase{
	
	private ArabicToRomanNumberConverter arabicToRomanNumberConverter;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		arabicToRomanNumberConverter = new ArabicToRomanNumberConverter();
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan5() throws Exception {
		int numberToConvert1 = 3;
		String expectedRomanNumeral1 = "III";
		assertEquals(expectedRomanNumeral1, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert1));
		
		int numberToConvert2 = 4;
		String expectedRomanNumeral2 = "IV";
		assertEquals(expectedRomanNumeral2, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert2));
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan10() throws Exception {
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
	
	public void testConvert_CanConvertNumbersThatAreLessThan50() throws Exception {
		int numberToConvert1 = 14;
		String expectedRomanNumeral1 = "XIV";
		assertEquals(expectedRomanNumeral1, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert1));
		
		int numberToConvert2 = 33;
		String expectedRomanNumeral2 = "XXXIII";
		assertEquals(expectedRomanNumeral2, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert2));
		
		int numberToConvert3 = 41;
		String expectedRomanNumeral3 = "XLI";
		assertEquals(expectedRomanNumeral3, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert3));
		
		int numberToConvert4 = 44;
		String expectedRomanNumeral4 = "XLIV";
		assertEquals(expectedRomanNumeral4, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert4));
		
		int numberToConvert5 = 49;
		String expectedRomanNumeral5 = "XLIX";
		assertEquals(expectedRomanNumeral5, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert5));
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan100() throws Exception {
		int numberToConvert1 = 54;
		String expectedRomanNumeral1 = "LIV";
		assertEquals(expectedRomanNumeral1, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert1));
		
		int numberToConvert2 = 63;
		String expectedRomanNumeral2 = "LXIII";
		assertEquals(expectedRomanNumeral2, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert2));
		
		int numberToConvert3 = 82;
		String expectedRomanNumeral3 = "LXXXII";
		assertEquals(expectedRomanNumeral3, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert3));
		
		int numberToConvert4 = 94;
		String expectedRomanNumeral4 = "XCIV";
		assertEquals(expectedRomanNumeral4, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert4));
		
		int numberToConvert5 = 99;
		String expectedRomanNumeral5 = "XCIX";
		assertEquals(expectedRomanNumeral5, arabicToRomanNumberConverter.convertToRomanNumeral(numberToConvert5));
	}
}
