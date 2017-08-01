package com.dataStructure.tree;

public class BinaryTreeNode {

	private int data;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int data){
		this.data = data;
		leftNode = null;
		rightNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
