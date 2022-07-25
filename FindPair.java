package com.greatlearning.binarysearchtree;

import java.util.Set;

public class FindPair {

	// Function to find a pair with a given sum in the BST
	public static boolean findPair(Node root, int target, Set<Integer> set) {
		// base case
		if (root == null) {
			return false;
		}

		// return true if pair is found in the left subtree; otherwise, continue
		// processing the node
		if (findPair(root.left, target, set)) {
			return true;
		}

		// if a pair is formed with the current node, print the pair and return true
		if (set.contains(target - root.data)) {
			System.out.println("Pair is (" + (target - root.data) + ", " + root.data + ")");
			return true;
		}

		// insert the current node's value into the set
		else {
			set.add(root.data);
		}

		// search in the right subtree
		return findPair(root.right, target, set);
	}
}
