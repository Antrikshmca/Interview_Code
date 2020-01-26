package com.antriksh.sorting;

import java.util.Arrays;

public class MergeSort {

	static void mergesort(int arr[], int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;
			mergesort(arr, l, mid);
			mergesort(arr, mid + 1, h);
			merge(arr, l, mid, h);
		}
	}

	private static void merge(int[] arr, int l, int mid, int h) {
		int i=l;
		int j=mid+1;
		int k=l;
		int temp[]=new int[arr.length];
		while(i<=mid && j<=h){
			if(arr[i]<=arr[j]){
				temp[k]=arr[i];
				i++;
				k++;
			}
			else{
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		if(i>mid){
			while(j<=h){
				temp[k]=arr[j];
				j++;
				k++;
				
			}
		}else{
				while(i<=mid){
					temp[k]=arr[i];
					i++;
					k++;
				}
			}
		
		for( i=l;i<=h;i++){
			arr[i]=temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = { 8, 5, 7, 9, 0, 3 ,2,1};
		
		mergesort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
