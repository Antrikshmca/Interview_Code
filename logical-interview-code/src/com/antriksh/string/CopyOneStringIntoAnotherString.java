package com.antriksh.string;

public class CopyOneStringIntoAnotherString {

	public static void main(String[] args) {
     String str="Srivastava";
     char[] charArray = str.toCharArray();
     int len=str.length();
     char[] ch=new char[len];
     int i=0;
     while(i!=len){
    	 ch[i]=charArray[i];
    	i++; 
     }
     System.out.println(ch);
    
	}

}
