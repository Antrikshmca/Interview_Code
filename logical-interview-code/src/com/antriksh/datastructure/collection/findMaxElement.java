package com.antriksh.datastructure.collection;

import java.util.Stack;

public class findMaxElement {
	
	Stack<Integer> s;
	Integer maxEle;

	// Constructor
	public findMaxElement() {
	
		s = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	void getMax() {
		// Get the maximum number in the entire stack
		if (s.isEmpty())
			System.out.println("Stack is empty");

		// variable maxEle stores the maximum element
		// in the stack.
		else
			System.out.println("Maximum Element in the " + " stack is: " + maxEle);
	}
	// prints top element of MyStack
		void peek() {
			if (s.isEmpty()) {
				System.out.println("Stack is empty ");
				return;
			}

			Integer t = s.peek(); // Top element.

			System.out.print("Top Most Element is: ");

			// If t < maxEle means maxEle stores
			// value of t.
			if (t > maxEle)
				System.out.println(maxEle);
			else
				System.out.println(t);
		}

	void push(Integer x) {
		if (s.isEmpty()) {
			maxEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x > maxEle) {
			s.push(2 * x - maxEle);
			maxEle = x;
		} else
			s.push(x);
		System.out.println("Number Inserted: " + x);
	}
	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Top Most Element Removed: ");
		Integer top = s.pop();

		// Minimum will change as the minimum element
		// of the stack is being removed.
		if (top > maxEle) {
			System.out.println(maxEle);
			maxEle = 2 * maxEle - top;
		} else
			System.out.println(top);
	}
public static void main(String[] args) {
	findMaxElement s = new findMaxElement();
	s.push(3);
	s.push(5);
	s.getMax();
	s.push(2);
	s.push(1);
	System.out.println("Getting Max Element");
	s.getMax();

	s.pop();
	System.out.println("Getting Max Element");
	s.getMax();
	s.pop();
	s.peek();	
}
	
}
