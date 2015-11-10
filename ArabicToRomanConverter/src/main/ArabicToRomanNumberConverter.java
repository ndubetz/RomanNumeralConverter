package main;

public class ArabicToRomanNumberConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		String convertedString = "";
		while(numberToConvert > 10){
			if (numberToConvert > 40){
				convertedString += "XL";
				numberToConvert -= 40;			
			}
			else{	
				convertedString += "X";
				numberToConvert -= 10;
			}
		}
		return convertedString + convertOnesDigitToRomanNumeral(numberToConvert);
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
