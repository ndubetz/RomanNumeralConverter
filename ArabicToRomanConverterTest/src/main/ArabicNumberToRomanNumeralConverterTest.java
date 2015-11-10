package main;

import junit.framework.TestCase;

public class ArabicNumberToRomanNumeralConverterTest extends TestCase{
	
	private ArabicNumberToRomanNumeralConverter arabicNumberToRomanNumeralConverter;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		arabicNumberToRomanNumeralConverter = new ArabicNumberToRomanNumeralConverter();
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan100() throws Exception {
		int[] numbersToConvert = {3,4,5,7,9,14,33,41,44,49,54,63,82,94,99};
		String [] expectedRomanNumerals = {"III", "IV", "V", "VII", "IX", "XIV", "XXXIII", "XLI", 
				"XLIV", "XLIX", "LIV", "LXIII", "LXXXII", "XCIV", "XCIX"};
		
		for(int i = 0; i < expectedRomanNumerals.length; i++){
			assertEquals(expectedRomanNumerals[i], 
					arabicNumberToRomanNumeralConverter.convertToRomanNumeral(numbersToConvert[i]));
		}
	}
}
