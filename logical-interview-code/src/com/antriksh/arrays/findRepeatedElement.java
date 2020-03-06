package com.antriksh.arrays;

public class findRepeatedElement {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4 };
		int count = 0;
		int temp = 0;
		String finalResult = "";
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				temp = arr[i];
			}
			if (temp == arr[i]) {
				count++;
			} else {
				if (count > 1) {
					finalResult = finalResult + temp + " Occours " + count + " times\n";
					//break;
				}

				count = 1;
				temp = arr[i];

			}
			if (i == arr.length - 1) {
				if (count > 1) {
					
					finalResult = finalResult + temp + "Occours " + count + " times\n";
					//break;
				}
			}
		}
		System.out.println(finalResult);
	}
}



