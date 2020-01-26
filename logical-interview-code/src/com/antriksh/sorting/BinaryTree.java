package com.antriksh.sorting;

public class BinaryTree {
	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		Node first = new Node(9);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		// Node fifth = new Node(1);

		root = first;
		first.left = second;
		first.right = third;

		second.left = fourth;
		// second.right = fifth;
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		System.out.println("post order"+"\n");
		BinaryTree p = new BinaryTree();
		p.createBinaryTree();
		p.postOrder(p.root);
		System.out.println("\n"+"preorder"+"\n");
		BinaryTree pr = new BinaryTree();
		pr.createBinaryTree();
		pr.preOrder(pr.root);
		System.out.println("\n"+"inorder"+"\n");
		BinaryTree b = new BinaryTree();
		b.createBinaryTree();
		b.inOrder(b.root);
	}

}
