package com.greatlearning.binarysearchtree;

//A class to store a BST node
class Node {
	int data;
	Node left = null, right = null;

	Node(int data) {
		this.data = data;
	}

	// Recursive function to insert a key into a BST
	public static Node insert(Node root, int key) {
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node(key);
		}

		// if the given key is less than the root node, recur for the left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if the given key is more than the root node, recur for the right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

}
