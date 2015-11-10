package main;

import junit.framework.TestCase;

public class ArabicNumberValidatorTest extends TestCase {
	
	private ArabicNumberValidator arabicNumberValidator;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		arabicNumberValidator = new ArabicNumberValidator();
	}
	
	@Override
	protected void tearDown() throws Exception {
		arabicNumberValidator = null;
		super.tearDown();
	}
	
	public void testCanBeConvertedToRomanNumeral_ReturnsTrueIfNumberIsGreaterThanZero() throws Exception {
		assertTrue(arabicNumberValidator.canBeConvertedToRomanNumeral(1));
	}
	
	public void testCanBeConvertedToRomanNumeral_ReturnsFalseIfNumberIsLessThanOrEqualToZero() throws Exception {
		assertFalse(arabicNumberValidator.canBeConvertedToRomanNumeral(0));
		assertFalse(arabicNumberValidator.canBeConvertedToRomanNumeral(Integer.MIN_VALUE));
	}
	
	public void testCanBeConvertedToRomanNumeral_ReturnsFalseIfNumberIsGreaterThan3999AndTrueIfLessThan3999() throws Exception {
		assertFalse(arabicNumberValidator.canBeConvertedToRomanNumeral(4000));
		assertTrue(arabicNumberValidator.canBeConvertedToRomanNumeral(3999));
	}
}
