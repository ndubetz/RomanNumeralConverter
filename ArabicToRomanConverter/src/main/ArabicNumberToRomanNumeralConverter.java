package main;

public class ArabicNumberToRomanNumeralConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		int thousandsDigit = numberToConvert / 1000;
		int hundredsDigit = (numberToConvert % 1000) / 100;
		int tensDigit = (numberToConvert % 100) / 10;
		int onesDigit = numberToConvert % 10;
		return convertToRomanNumeralRepresentation(thousandsDigit, "M", "", "") 
				+ convertToRomanNumeralRepresentation(hundredsDigit, "C", "D", "M")
				+ convertToRomanNumeralRepresentation(tensDigit, "X", "L", "C") 
				+ convertToRomanNumeralRepresentation(onesDigit, "I", "V", "X");
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
}
