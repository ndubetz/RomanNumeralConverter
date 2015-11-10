package main;

public class ArabicNumberToRomanNumeralConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		return convertToRomanRepresentation(numberToConvert / 10, "X", "L", "C") 
				+ convertToRomanRepresentation(numberToConvert % 10, "I", "V", "X");
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
