package com.antriksh.string;

public class ConvertStringToInt {

	public static void main(String[] args) {

		String str="-123";
		int len=str.length();
		int i=0,number=0;
		boolean isNegative=false;
		if(str.charAt(i)=='-'){
			isNegative=true;
			i=1;
		}
		while(i<len){
			number=number*10;
			number +=(str.charAt(i++) -'0');
			System.out.println("i = "+i+"\t "+"num= "+number);
		}
		if(isNegative){
			number=  -number;
		}
		
	}

}
