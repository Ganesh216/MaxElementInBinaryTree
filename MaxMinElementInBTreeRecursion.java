package com.dataStructure.tree;

import java.util.Scanner;

public class MaxMinElementInBTreeRecursion {


	private BinaryTreeNode root;
	
	MaxMinElementInBTreeRecursion(){
		root=null;
	}
	private void findMaxMinElement() {
	System.out.println("Maximum Element is --> "+findMaxMinElement(root));
	}
	
	public int findMaxMinElement(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		if(root != null){
			int maxLeft = findMaxMinElement(root.leftNode);
			int maxRight = findMaxMinElement(root.rightNode);
			if(maxLeft > maxRight){
				maxValue = maxLeft;
			}else{
				maxValue = maxRight;
			}
			if(root.getData() > maxValue){
				maxValue = root.getData();
			}
		}
		return maxValue;
	}
	
	public void insertDataIntoTree(int data) {
		root = insertData(root, data);
	}
	
	public BinaryTreeNode insertData(BinaryTreeNode rootNode, int data) {
		if(rootNode == null)
			rootNode = new BinaryTreeNode(data);
		else{
			if(rootNode.getLeftNode() == null){
				rootNode.leftNode = insertData(rootNode.leftNode, data);
			}else{
				rootNode.rightNode = insertData(rootNode.rightNode, data);
			}
		}
		return rootNode;
	}
	
	public static void main(String ar[]){
		
		MaxMinElementInBTreeRecursion maxMinElementInBTreeRecursion = new MaxMinElementInBTreeRecursion();
		Scanner scanner  = new Scanner(System.in);
		char ch=' ' ;
		do {
			System.out.println("Press 1 to insert element : ");
			System.out.println("Press 2 to find maximum element : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:System.out.println("Enter integer element to insert");
					maxMinElementInBTreeRecursion.insertDataIntoTree(scanner.nextInt());
				
				break;
			
			case 2:	maxMinElementInBTreeRecursion.findMaxMinElement();
				
				break;

			default:
				break;
			}
			
		System.out.println("Do you want to continue:: ");
		ch = scanner.next().charAt(0);
		} while (ch=='y' || ch=='Y');
		
	
	}
	

}
