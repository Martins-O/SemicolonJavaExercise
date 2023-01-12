package com.chapter8;

public class HugeInteger {
	private final int[] digitArray = new int[40];
	public void parse(String number){
		for(int index = 0; index < number.length(); index++){
			String character = Character.toString(number.charAt(index));
			digitArray[index] = Integer.parseInt(character);
		}
	}
	public boolean isEqualTo(int number1, int number2){
		boolean check = false;
		if(number1 == number2){
			check = true;
		}
		return check;
	}

	public boolean isNotEqualTo(int number1, int number2){
		if(number1 != number2){
			return true;
		}
		return false;
	}

	public boolean isGreaterThan(int number1, int number2){
		if(number1 > number2){
			return true;
		}
		return false;
	}

	public boolean isLessThan(int number1, int number2){

		if(number1 < number2){
			return true;
		}
		return false;
	}

	public boolean isGreaterThanOrEqualTo(int number1, int number2){

		if(number1 >= number2){
			return true;
		}
		return false;
	}

	public boolean isLessThanOrEqualTo(int number1, int number2){

		if(number1<= number2){
			return true;
		}
		return false;
	}

	public boolean isZero(int number){

		if(number == 0){
			return true;
		}
		return false;
	}

	public int add(int number1, int number2){
		return number1 + number2;
	}


	public int subtract(int number1, int number2){
		return number1 - number2;
	}


	public String toString(int number){
		return Integer.toString(number);
	}

	public String toString(){
		StringBuilder number = new StringBuilder();
		for(int index = 0; index < digitArray.length; index++){
			number.append(Integer.toString(digitArray[index]));
		}
		return number.toString();
	}

	public int[] getDigitArray() {
		return digitArray;
	}

	public void setNumber(int intNumber){
		String number = Integer.toString(intNumber);
		for(int index = 0; index < number.length(); index++){
			String character = Character.toString(number.charAt(index));
			digitArray[index] = Integer.parseInt(character);
		}
	}

	public int getNumber(){
		StringBuilder number = new StringBuilder();
		for(int index = 0; index < digitArray.length; index++){
			number.append(Integer.toString(digitArray[index]));
		}
		return Integer.parseInt(number.toString());
	}
}