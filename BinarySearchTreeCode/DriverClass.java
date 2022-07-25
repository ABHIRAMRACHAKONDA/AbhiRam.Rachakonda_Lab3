package com.greatlearning.binarysearchtree;

import java.util.HashSet;
import java.util.Set;

public class DriverClass {
	public static void main(String[] args) {
		int[] keys = { 40, 20, 60, 10, 30, 50, 70 };

		Node root = null;

		for (int key : keys) {
			root = Node.insert(root, key);
		}

		// find pair with the given sum
		int target = 130;

		// create an empty set
		Set<Integer> set = new HashSet<>();
		if (!FindPair.findPair(root, target, set)) {
			System.out.println("Nodes are not found");
		}
	}
}
