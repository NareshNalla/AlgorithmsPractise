package com.gfg.trees.binary;

import java.util.Stack;

public class BinarySearch {
	static TreeNode root;

	static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		createBinaryTree();
		System.out.println("Pre order");
		preOrder(root);
		System.out.println("\n Pre order");
		preOrderIterative();
		System.out.println("\n IN Order");
		inOrder(root);
		System.out.println("\n Iterative In Order");
		inOrderIterative();
		System.out.println("\n Post Order");
		postOrder(root);
	}

	private static void preOrderIterative() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");

			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}

	}

	@SuppressWarnings("unused")
	private static void inOrderIterative() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;

		while (!stack.isEmpty() || temp != null) {
			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}

	}

	private static void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	private static void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	private static void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	private static void createBinaryTree() {
		/*
		 * TreeNode first = new TreeNode(1); 
		 * TreeNode second = new TreeNode(2);
		 * TreeNode third = new TreeNode(9); 
		 * TreeNode fourth = new TreeNode(3);
		 * TreeNode fifth = new TreeNode(4);
		 */
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		if (root == null) {
			root = first;
		}
		first.left = second;
		first.right = third;
		second.left = fourth;
	}

}
