package main;

public class ArabicToRomanNumberConverter {

	public String convertToRomanNumeral(int numberToConvert) {
		String convertedString = "";
		while(numberToConvert > 0){
			if(numberToConvert == 4){
				convertedString += "IV";
				numberToConvert -= 4;
			}
			else{
				convertedString += "I";
				numberToConvert--;
			}
		}
		return convertedString;
	}

}
