package com.antriksh.string.buildInMethods;

public class ReplaceAllWhiteSpace {

	public static void main(String[] args) {
      String str="hello word	from java";
      str=str.replaceAll("\\s", "");
      System.out.println(str);
		
	}

}
