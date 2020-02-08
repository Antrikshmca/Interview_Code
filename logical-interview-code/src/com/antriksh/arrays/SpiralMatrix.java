package com.antriksh.arrays;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int row = 0;
		int col = 0;
		int base_row = 0;
		int last_col = n - 1;
		for (int num = 1; num <= n * n; num++) {
			arr[row][col] = num;
			if (row == base_row && col < last_col) {
				col++;
			} else if (col == last_col && row < last_col) {
				row++;
			} else if (row == last_col && col > base_row) {
				col--;
			} else if (col == base_row && row > base_row) {
				row--;
			}
			if (arr[row][col] != 0) {
				row++;
				col++;
				base_row++;
				last_col--;
			}
		}
		// Display Matrix in Spiral Form
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

}
