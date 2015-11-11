package main;

public class RomanNumeralToArabicNumberConverter {

	public int convertToArabicNumber(String romanNumeralToConvert) {
		int convertedNumber = 0;
		
		char[] romanNumeralChars = romanNumeralToConvert.toCharArray();
		for(int i = 0; i < romanNumeralChars.length; i++){
			if(romanNumeralChars[i] == 'I'){
				if(i < romanNumeralChars.length - 1){
					if(romanNumeralChars[i + 1] == 'V'){
						convertedNumber += 4;
						i++;
					}
					else if (romanNumeralChars[i + 1] == 'X'){
						convertedNumber += 9;
						i++;
					}
					else{
						convertedNumber += 1;
					}
				}else{
					convertedNumber += 1;
				}
			}
			else if (romanNumeralChars[i] == 'V'){
				convertedNumber += 5;
			}
			else if (romanNumeralChars[i] == 'X'){
				if(romanNumeralChars[i + 1] == 'L'){
					convertedNumber += 40;
					i++;
				}
				else if (romanNumeralChars[i + 1] == 'C'){
					convertedNumber += 90;
					i++;
				}
				else{
					convertedNumber += 10;
				}
			}else{
				convertedNumber += 50;
			}
		}
		return convertedNumber;
	}

}
