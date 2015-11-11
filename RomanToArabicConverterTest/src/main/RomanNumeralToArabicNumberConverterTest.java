package main;

import junit.framework.TestCase;

public class RomanNumeralToArabicNumberConverterTest extends TestCase {
	
	private RomanNumeralToArabicNumberConverter romanNumeralToArabicNumberConverter;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		romanNumeralToArabicNumberConverter = new RomanNumeralToArabicNumberConverter();
	}
	
	@Override
	protected void tearDown() throws Exception {
		romanNumeralToArabicNumberConverter = null;
		super.tearDown();
	}
	
	public void testConvert_CanConvertNumeralsLessThanC() throws Exception {
		String [] romanNumeralsToConvert = {"II", "IV", "VI", "VIII", "IX", "XIV", "XXXIII", "XLI", 
				"XLIV", "XLIX", "LIV", "LXXX", "LXXXVII", "XCIV", "XCIX"};
		int[] expectedArabicNumbers = {2,4,6,8,9,14,33,41,44,49,54,80,87,94,99};

		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
				romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumeralsLessThanD() throws Exception {
		String [] romanNumeralsToConvert = {"C", "CXLIV", "CLXV", "CCVIII", "CCXLIX", "CCCXIV", "CCCXXXIII", 
				"CCCXLI", "CDXLV", "CDXLIX", "CDLIV", "CDLXXX", "CDLXXXVII", "CDXCIV", "CDXCIX"};
		int[] expectedArabicNumbers = {100,144,165,208,249,314,333,341,445,449,454,480,487,494,499};
		
		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
					romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumeralsLessThanM() throws Exception {
		String [] romanNumeralsToConvert = {"D", "DXLIV", "DLXV", "DCVIII", "DCCXLIX", "DCCCXIV", "DCCCXXXIII", 
				"DCCCXLI", "CMXLV", "CMXLIX", "CMLIV", "CMLXXX", "CMLXXXVII", "CMXCIV", "CMXCIX"};
		int[] expectedArabicNumbers = {500,544,565,608,749,814,833,841,945,949,954,980,987,994,999};
		
		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
					romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertUpToMMMCMXCIX(){
		String [] romanNumeralsToConvert = {"MCCC", "MCDXLIV", "MCMLXV", "MCMXCIX", "MMXV", "MMCCXXII", "MMDCCXXXVIII", 
				"MMMI", "MMMCCCXXXIII", "MMMCDL", "MMMCMLIV", "MMMCMLXXX", "MMMCMLXXXVII", "MMMCMXCIV", "MMMCMXCIX"};
		int[] expectedArabicNumbers = {1300,1444,1965,1999,2015,2222,2738,3001,3333,3450,3954,3980,3987,3994,3999};
		
		for(int i = 0; i < expectedArabicNumbers.length; i++){
			assertEquals(expectedArabicNumbers[i], 
					romanNumeralToArabicNumberConverter.convertToArabicNumber(romanNumeralsToConvert[i]));
		}
	}
}
