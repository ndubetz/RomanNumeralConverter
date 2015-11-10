package main;

public class ArabicNumberValidator {

	public boolean canBeConvertedToRomanNumeral(String integerToCheck) {
		try{
			int integer = Integer.parseInt(integerToCheck);
			return integer > 0 && integer < 4000;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
}
