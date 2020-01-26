package com.antriksh.datastructure.linkedlist;

public class DoubleL {
	Node head;
	Node tail;
	int lenght;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	public DoubleL() {
		this.head = null;
		this.tail = null;
		this.lenght = 0;
	}

	public boolean isEmpty() {
		return lenght == 0;
	}

	public int lenght() {
		return lenght;
	}

	public void displayforward() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println("null");
	}

	public void displayBackward() {
		if (head == null) {
			return;
		}
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.prev;

		}
		System.out.println("null");
	}

	public void insertbeg(int data) {
		Node temp = new Node(data);
		if (isEmpty()) {
			tail = temp;

		} else {
			head.prev = temp;

		}
		temp.next = head;
		head = temp;
		lenght++;
	}

	public static void main(String[] args) {
		DoubleL a = new DoubleL();
		a.insertbeg(10);
		a.insertbeg(20);
		a.insertbeg(30);
		a.insertbeg(40);
		a.insertbeg(50);
		
		a.displayforward();
		a.displayBackward();
	}

}
