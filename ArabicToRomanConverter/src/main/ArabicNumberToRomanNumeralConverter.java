package main;

public class ArabicNumberToRomanNumeralConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		int hundredsDigit = numberToConvert / 100;
		int tensDigit = (numberToConvert % 100) / 10;
		int onesDigit = numberToConvert % 10;
		return convertToRomanRepresentation(hundredsDigit, "C", "D", "M")
				+ convertToRomanRepresentation(tensDigit, "X", "L", "C") 
				+ convertToRomanRepresentation(onesDigit, "I", "V", "X");
	}

	private String convertToRomanRepresentation(int numberToConvert, String oneSymbol, 
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
