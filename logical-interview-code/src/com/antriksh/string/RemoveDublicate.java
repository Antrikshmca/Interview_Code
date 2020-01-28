package com.antriksh.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
	 static String str = "Shivamm";
	public static void main(String[] args) {
		 
		System.out.println( removeDublicate());
		
	}
	public static String removeDublicate()
	{
		Set<Character> set=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			Character c=str.charAt(i);
			//set.add(c);
			if(!set.contains(c)){
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}


}
