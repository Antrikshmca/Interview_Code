package com.antriksh.string;

public class FindLength {

	public static void main(String[] args) {
       String str="Hello World";
       str=str.concat("\0");
       char[] ch = str.toCharArray();
       int i=0;
      int  count=1;
       while(ch[i]!='\0'){
    	   i++;
    	   count++;
       }
       System.out.println(count);
	}

}
