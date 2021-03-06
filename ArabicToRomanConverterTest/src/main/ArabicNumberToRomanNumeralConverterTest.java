package main;

import junit.framework.TestCase;

public class ArabicNumberToRomanNumeralConverterTest extends TestCase{
	
	private ArabicNumberToRomanNumeralConverter arabicNumberToRomanNumeralConverter;
	private ArabicNumberValidator arabicNumberValidator;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		arabicNumberValidator = new ArabicNumberValidator();
		arabicNumberToRomanNumeralConverter = new ArabicNumberToRomanNumeralConverter(arabicNumberValidator);
	}
	
	@Override
	protected void tearDown() throws Exception {
		arabicNumberToRomanNumeralConverter = null;
		super.tearDown();
	}
	
	public void testGetArabicNumberValidator() throws Exception {
		assertSame(arabicNumberValidator, arabicNumberToRomanNumeralConverter.getArabicNumberValidator());
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan100() throws Exception {
		String[] numbersToConvert = {"3","4","5","7","9","14","33","41","44","49","54","63","82","94","99"};
		String [] expectedRomanNumerals = {"III", "IV", "V", "VII", "IX", "XIV", "XXXIII", "XLI", 
				"XLIV", "XLIX", "LIV", "LXIII", "LXXXII", "XCIV", "XCIX"};
		
		for(int i = 0; i < expectedRomanNumerals.length; i++){
			assertEquals(expectedRomanNumerals[i], 
					arabicNumberToRomanNumeralConverter.convertToRomanNumeral(numbersToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan1000() throws Exception {
		String[] numbersToConvert = {"113","244","333","375","397","409","414","444","541"
				,"649","754","763","882","994","999"};
		String [] expectedRomanNumerals = {"CXIII", "CCXLIV", "CCCXXXIII", "CCCLXXV", "CCCXCVII", "CDIX", "CDXIV",  
				"CDXLIV", "DXLI", "DCXLIX", "DCCLIV", "DCCLXIII", "DCCCLXXXII", "CMXCIV", "CMXCIX"};
		
		for(int i = 0; i < expectedRomanNumerals.length; i++){
			assertEquals(expectedRomanNumerals[i], 
					arabicNumberToRomanNumeralConverter.convertToRomanNumeral(numbersToConvert[i]));
		}
	}
	
	public void testConvert_CanConvertNumbersThatAreLessThan3999() throws Exception {
		String[] numbersToConvert = {"1113","1244","1375","1997","1999","2414","2444","2541",
				"2649","2754","3063","3333","3882","3994","3999"};
		String [] expectedRomanNumerals = {"MCXIII", "MCCXLIV", "MCCCLXXV", "MCMXCVII", "MCMXCIX", "MMCDXIV",  
				"MMCDXLIV", "MMDXLI", "MMDCXLIX", "MMDCCLIV", "MMMLXIII", "MMMCCCXXXIII", "MMMDCCCLXXXII", "MMMCMXCIV", "MMMCMXCIX"};
		
		for(int i = 0; i < expectedRomanNumerals.length; i++){
			assertEquals(expectedRomanNumerals[i], 
					arabicNumberToRomanNumeralConverter.convertToRomanNumeral(numbersToConvert[i]));
		}
	}
	
	public void testConvert_ReturnsInvalidInputIfNumberAsStringIsNotValidArabicNumber() throws Exception {
		String expectedValue = "Invalid Input";
		
		assertEquals(expectedValue, arabicNumberToRomanNumeralConverter.convertToRomanNumeral("0"));
		assertEquals(expectedValue, arabicNumberToRomanNumeralConverter.convertToRomanNumeral("4000"));
		assertEquals(expectedValue, arabicNumberToRomanNumeralConverter.convertToRomanNumeral(""));
		assertEquals(expectedValue, arabicNumberToRomanNumeralConverter.convertToRomanNumeral(null));
	}
}
