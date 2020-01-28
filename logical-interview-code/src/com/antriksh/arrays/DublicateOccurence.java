package com.antriksh.arrays;

public class DublicateOccurence {

	public static void main(String[] args) {

		Integer x[]={1,2,3,3,4,5,2};
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j < x.length; j++) {
				if(x[i]==x[j]){
					System.out.println(x[i]);
					return ;
				}
			}
		}
	}

}
