package com.antriksh.datastructure.collection;

public class DoubleEndedQueue {
	static int capacity = 5, front= -1, rear = -1;
	static int queue[] = new int[capacity];
	static int len = queue.length - 1, leng = queue.length;

	private static void enqueFront(int data) {
		if ((front == 0 && rear == len) || (front == rear + 1)) {
			System.out.println("queue is empty ");
		} else if (front == -1 && rear == -1) {
			front = rear = 0;
			queue[front] = data;
		} else if (front == 0) {
			front = len;
			queue[front] = data;
		} else {
			front--;
			queue[front] = data;

		}
	}

	private static void enqueRear(int data) {
		if ((front == 0 && rear == len) || (front == rear + 1)) {
			System.out.println("queue is full ");
		} else if (front == -1 && rear == -1) {
			front = rear = 0;
			queue[rear] = data;
		} else if (rear == len) {
			rear = 0;
			queue[rear] = data;
		} else {
			rear++;
			queue[rear] = data;

		}
	}

	public static void display() {
		int i = front;
		while (i != rear) {
			System.out.println(queue[i]);
			i = (i + 1) % leng;
		}
		System.out.println(queue[i]);
	}

	public static void getFront() {

		if ((front == 0 && rear == len) || (front == rear + 1)) {
			System.out.println("queue is empty ");
		} else {
			System.out.println(queue[front]);
		}
	}

	public static void getRear() {

		if ((front == 0 && rear == len) || (front == rear + 1)) {
			System.out.println("queue is empty ");
		} else {
			System.out.println(queue[rear]);
		}
	}

	public static void dequeFront() {
		if (front == -1 && rear == -1) {
			System.out.println("queue is empty ");
		} else if (front == rear) {
			front = rear = -1;
		} else if (front == len) {
			System.out.println(queue[front]);
			front = 0;
		} else {
			System.out.println(queue[front]);
			front++;
		}
	}

	public static void dequeRear() {
		if (front == -1 && rear == -1) {
			System.out.println("queue is empty ");
		} else if (front == rear) {
			front = rear = -1;
		} else if (rear == 0) {
			System.out.println(queue[rear]);
			rear = len;
		} else {
			System.out.println(queue[rear]);
			rear--;
		}
	}

	public static void main(String[] args) {

		enqueFront(2);
		enqueFront(5);
		enqueRear(-1);
		enqueRear(0);
		enqueFront(7);
		//enqueFront(4);
		display();
		getFront();
		getRear();
	}

}
