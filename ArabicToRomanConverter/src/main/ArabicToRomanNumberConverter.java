package main;

public class ArabicToRomanNumberConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		return convertOnesDigitToRomanNumeral(numberToConvert % 10);
	}

	private String convertOnesDigitToRomanNumeral(int numberToConvert){
		String convertedString = "";
		while(numberToConvert > 0){
			if (numberToConvert == 9){
				convertedString += "IX";
				numberToConvert -= 9;
			}
			else if(numberToConvert > 4){
				convertedString += "V";
				numberToConvert -= 5;
			}
			else{
				if(numberToConvert == 4){
					convertedString += "IV";
					numberToConvert -= 4;
				}
				else{
					convertedString += "I";
					numberToConvert--;
				}
			}
		}
		return convertedString;
	}
}
