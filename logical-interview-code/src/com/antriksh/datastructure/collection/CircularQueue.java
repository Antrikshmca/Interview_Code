
package com.antriksh.datastructure.collection;

import java.util.Arrays;

public class CircularQueue {
	int front = -1;
	int rear = -1;
	int size = 6;
	int arr[] = new int[size];

	public void insert(int data) {
		if (front == rear + 1 || rear == size - 1) {
			System.out.println("queue is full");
		} else if (front == -1 && rear == -1) {
			front = rear = 0;
			arr[rear] = data;
		} else if (rear == size - 1) {
			rear = 0;
			arr[rear] = data;
		} else {
			rear++;
			arr[rear] = data;
		}
	}

	void delete() {
		int data;
		if (front == -1 && rear == -1) {
			
			System.out.println("queue is empty");
		} else if (front == rear) {
			data = arr[front];
			front = rear = -1;
		}
		if (front == size - 1) {
			data = arr[front];
			front = 0;
		} else {
			data = arr[front];
			front++;
		}
	}

	public void display() {
		for (int b : arr) {
			System.out.println(b);
			
		}
	}

	public static void main(String[] args) {
		CircularQueue c = new CircularQueue();
		c.insert(23);
		c.insert(28);
		c.insert(24);
		c.display();
		c.delete();
		c.display();

	}

}