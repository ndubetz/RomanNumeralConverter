package main;

public class ArabicNumberToRomanNumeralConverter {

	private ArabicNumberValidator arabicNumberValidator;

	public ArabicNumberToRomanNumeralConverter(
			ArabicNumberValidator arabicNumberValidator) {
				this.arabicNumberValidator = arabicNumberValidator;
	}

	public String convertToRomanNumeral(String numberToConvertAsString) {
		if(this.arabicNumberValidator.canBeConvertedToRomanNumeral(numberToConvertAsString)){
			int numberToConvert = Integer.parseInt(numberToConvertAsString);
			int thousandsDigit = numberToConvert / 1000;
			int hundredsDigit = (numberToConvert % 1000) / 100;
			int tensDigit = (numberToConvert % 100) / 10;
			int onesDigit = numberToConvert % 10;
			return convertToRomanNumeralRepresentation(thousandsDigit, "M", "", "") 
				+ convertToRomanNumeralRepresentation(hundredsDigit, "C", "D", "M")
				+ convertToRomanNumeralRepresentation(tensDigit, "X", "L", "C") 
				+ convertToRomanNumeralRepresentation(onesDigit, "I", "V", "X");
		}
		else{
			return "Invalid Input";
		}
	}

	private String convertToRomanNumeralRepresentation(int numberToConvert, String oneSymbol, 
			String fiveSymbol, String tenSymbol){
		String convertedString = "";
		while(numberToConvert > 0){
			if (numberToConvert == 9){
				convertedString += oneSymbol + tenSymbol;
				numberToConvert -= 9;
			}
			else if(numberToConvert > 4){
				convertedString += fiveSymbol;
				numberToConvert -= 5;
			}
			else if(numberToConvert == 4){
				convertedString += oneSymbol + fiveSymbol;
				numberToConvert -= 4;
			}
			else{
				convertedString += oneSymbol;
				numberToConvert--;
			}
		}
		return convertedString;
	}

	public ArabicNumberValidator getArabicNumberValidator() {
		return this.arabicNumberValidator;
	}
}
