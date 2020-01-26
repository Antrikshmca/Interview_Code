package com.antriksh.datastructure.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	int top = -1;
	int size = 5;
	int arr[] = new int[size];

	public int push(int data) {
		if (size == top - 1) {
			System.out.println("Stack is full");

		} else {
			top++;
			arr[top] = data;
		}
		return top;
	}

	public void pop() {
		int data;
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			data = arr[top];
			arr[top] = 0;
			top--;
		}
	}

	public int peek() {
		int data;
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			data = arr[top];

		}
		return 1;
	}

	public void display() {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		int data, ch, flag = 0;
		System.out.println("Enter the your choice \n1.push \n2.pop "
				+ " \n3.peak \n4.display \n5.Exit");
		ch = sc.nextInt();
		while (flag<1) {
			switch (ch) {
			case 1:
				System.out.println("enter the data \n");
				data = sc.nextInt();
				s.push(data);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				System.out.println(s.peek());
				break;
			case 4:
				s.display();
				break;
			case 5:
				flag = 1;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}

		}

	/*.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.display();
		System.out.println(s.peek());*/
	}

}
