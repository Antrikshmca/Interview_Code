package com.antriksh.datastructure.linkedlist;

class Node1 {
	int data;
	// int lenght;
	public Node1 next;
}

class List {
	Node1 head;
	int lenght;

	public void insert(int data) {

		Node1 temp = new Node1();
		temp.data = data;
		temp.next = null;
		if (head == null) {
			head = temp;
		} else {
			Node1 n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = temp;
		}
	}

	public boolean isEmpty() {
		return lenght == 0;
	}

	public int lenght(Node1 head) {
		if (head == null) {
			return 0;
		}
		int count = 0;// to hold the lenght
		Node1 current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertatbeg(int data) {

		Node1 temp = new Node1();
		if (head == null) {
			// no element ther
		}
		temp.data = data;
		temp.next = head;
		head = temp;

	}

	public void insertAtPosition(int data, int pos) {
		int size = lenght(head);

		if (pos > size + 1 || pos < 1) {
			System.out.println("invalid choice");
		}
		Node1 temp = new Node1();
		if (pos == 1) {
			temp.next = head;

		}

		else {
			Node1 prev = head;
			int count = 1;
			while (count < pos - 1) {
				prev = prev.next;
				// prev.data = data;
				count++;
			}
			Node1 current = prev.next;
			temp.next = current;
			prev.next = temp;
			temp.data = data;
			// .data = data;
			// temp.next=current;

		}
	}

	public void insertatEnd(int data) {

		Node1 temp = new Node1();
		if (head == null) {
			// no element ther
		}
		Node1 current = head;
		while (null != current.next) {
			current = current.next;

		}
		current.next = temp;
		temp.data = data;

	}

	public void display() {
		Node1 n = head;
		while (n.next != null) {
			System.out.print(n.data + "-->");
			n = n.next;
		}
		System.out.println(n.data);

	}

	public void deleteAtBegging() {
		if (head == null) {
			return;
		}
		Node1 temp = head;
		head = head.next;
		temp.next = null;
	}

	void deleteAtPosition(int pos) {

		int size = lenght(head);
		if (pos > size || pos < 1) {
			System.out.println("invalid choice");
		}
		if (pos == 1) {
			Node1 temp = head;
			head = head.next;
			temp.next = null;

		} else {
			Node1 prev = head;
			int count = 1;
			while (count < pos - 1) {
				prev = prev.next;
				count++;
			}
			Node1 current = prev.next;
			prev.next = current.next;
			current.next = null;
		}
	}

	public void deleteAtLast() {
		if (head == null) {
			return;
		}
		Node1 last = head;
		Node1 previoustolast = null;
		while (last.next != null) {
			previoustolast = last;
			last = last.next;
		}
		previoustolast.next = null;
	}
}

public class LinkedList1 {

	public static void main(String[] args) {

		List l = new List();
		l.insert(5);
		l.insert(7);
		l.insert(8);
		l.insert(9);
		l.insertatbeg(3);
		l.insertAtPosition(10, 3);

		l.display();
		l.deleteAtBegging();
		l.display();
		l.deleteAtPosition(3);
		l.display();
		l.insertatEnd(90);
		l.display();
		l.deleteAtLast();
		l.display();
	}

}
