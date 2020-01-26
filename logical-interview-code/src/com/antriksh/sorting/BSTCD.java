package com.antriksh.sorting;

public class BSTCD {
	static Node root = null;

	class Node {
		int data;
		Node left;
		Node right;
	}

	public Node createnewnode(int data) {
		Node a = new Node();
		a.data = data;
		a.left = null;
		a.right = null;
		return a;
	}

	public Node insert(Node node, int data) {
		if (node == null) {
			createnewnode(data);
		}
		if (data < node.data) {
			node.left = insert(node.left, data);
		} else if (data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}

	public Node delete(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data < node.data) {
			node.left = delete(node.left, data);
		} else if (data > node.data) {
			node.right = delete(node.right, data);
		} else {
			if (node.left == null || node.right == null) {
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				if (temp == null) {
					return null;
				} else {
					return node;
				}
			}

			else {
				Node successor = getsuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right, 4);
				return node;
			}
		}
		return node;
	}

	public Node getsuccessor(Node node) {
		if (node == null) {
			return null;
		}

		Node temp = node.right;
		while (temp != null) {
			temp = temp.left;
		}
		return temp;
	}

	public void inorder(Node node) {
		if (node == null) {
			return;
		} else {
			inorder(node.left);
			System.out.println(node.data + " ");
			inorder(node.right);
		}
	}

	public static void main(String[] args) {
		BSTCD a = new BSTCD();
		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);

		// root=a.delete(root, 1);
		a.inorder(root);
		// System.out.println(root);
	}

}
