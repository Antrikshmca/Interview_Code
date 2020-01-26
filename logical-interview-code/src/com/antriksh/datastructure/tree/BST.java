package com.antriksh.datastructure.tree;

class Node {
	Node left, right;
	int data;
}

public class BST {

	Node root;

	public static Node findW(Node root, int data) {
		Node curr = root;
		while (curr != null) {

			if (curr.data > data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return null;
	}

	public static Node findWR(Node root, int data) {
		Node curr = root;
		if (curr == null) {
			return curr;
		}
		if (curr.data == data) {
			return curr;
		}
		if (curr.data > data) {
			return findWR(curr.left, data);
		} else {
			return findWR(curr.right, data);

		}
	}

	public static Node insert(Node root, int data) {
		Node prev;
		Node curr = root;
		boolean left;
		while (curr != null) {
			prev = curr;
			if (curr.data > data) {
				left = true;
				curr = curr.left;
			} else {
				curr = curr.right;
				left = false;
			}
			Node node = new Node();
			if (curr == null) {

			}
			if (left) {
				prev.left = node;
			} else {
				prev.right = node;
			}

		}
		return root;
	}

	public static void main(String[] args) {

	}
}
