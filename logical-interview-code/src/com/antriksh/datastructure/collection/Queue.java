package com.antriksh.datastructure.collection;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {

	int rear = 0;
	int front = 0;
	int size = 5;
	int arr[] = new int[size];

	public int Enque(int data) {
		if (size == rear) {
			System.out.println("Stack is full");

		} else {
			rear++;
			arr[rear] = data;
		}
		return rear;
	}

	public void Dequeue() {
		int data;
		if (rear == front) {
			System.out.println("queue is empty");
		} else {
			for (int i = rear; i < front; i++)
				arr[i] = arr[i + 1];

			rear--;
		}
	}

	public void display() {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Queue s = new Queue();
		Scanner sc = new Scanner(System.in);
		int data, ch, flag = 0;

		System.out.println("Enter the your choice \n1.Enque \n2.Dequeue " 
		+ "\n3.display \n4.Exit");
		ch = sc.nextInt();
		while (flag !=0) {
			switch (ch) {
			case 1:
				System.out.println("enter the data \n");
				data = sc.nextInt();
				s.Enque(data);
				break;
			case 2:
				s.Dequeue();
				break;
			case 3:
				s.display();
				break;
			case 4:
				flag = 1;
				break;

			default:
				System.out.println("invalid choice");
				break;
			}

		}

		/*
		 * .push(10); s.push(20); s.push(30); s.display(); s.pop(); s.display();
		 * System.out.println(s.peek());
		 */
	}

}