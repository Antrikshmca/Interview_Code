package com.antriksh.datastructure.collection;

import java.util.Stack;

public class findMinElement {
	
	Stack<Integer> s;
	Integer minEle;

	// Constructor
	public findMinElement() {
	
		s = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	void getMin() {
		// Get the maximum number in the entire stack
		if (s.isEmpty())
			System.out.println("Stack is empty");

		// variable maxEle stores the maximum element
		// in the stack.
		else
			System.out.println("Minimum Element in the " + " stack is: " + minEle);
	}
	// prints top element of MyStack
		void peek() {
			if (s.isEmpty()) {
				System.out.println("Stack is empty ");
				return;
			}

			Integer top = s.peek(); // Top element.

			System.out.print("Top Most Element is: ");

			// If t < maxEle means maxEle stores
			// value of t.
			if (top > minEle)
				System.out.println(minEle);
			else
				System.out.println(top);
		}

	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
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
		if (top < minEle) {
			System.out.println(minEle);
			minEle = 2 * minEle - top;
		} else
			System.out.println(top);
	}
public static void main(String[] args) {
	findMinElement s = new findMinElement();
	s.push(3);
	s.push(5);
	s.getMin();
	s.push(2);
	s.push(1);
	System.out.println("Getting Min Element");
	s.getMin();

	s.pop();
	System.out.println("Getting Min Element");
	s.getMin();
	s.pop();
	s.peek();	
}
	
}
