package com.antriksh.datastructure.linkedlist;

public class CircularLinkedList {

	Node last;
	int lenght;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public CircularLinkedList() {
		last = null;
		lenght = 0;

	}

	public boolean isEmpty() {
		return lenght == 0;
	}

	public int lenght() {
		return lenght;
	}

	public void createCL() {
		Node first = new Node(9);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;
	}

	public void display() {
		if (last == null) {
			return;
		}
		Node first = last.next;
		while (first != last) {
			System.out.print(first.data + " ");
			first = first.next;

		}
		System.out.print(first.data);

	}

	public static void main(String[] args) {
		CircularLinkedList c = new CircularLinkedList();
		c.createCL();
		c.display();

	}

}
