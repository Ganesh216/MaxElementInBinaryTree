package com.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaxMinElementInBTreeWithoutRecursion {


	private BinaryTreeNode root;
	
	MaxMinElementInBTreeWithoutRecursion(){
		root=null;
	}
	private int findMaxMinElement() {
		Queue<BinaryTreeNode> treeNodesQueue =  new LinkedList<BinaryTreeNode>();
		int maxElement = Integer.MIN_VALUE;
			treeNodesQueue.add(root);
			while(!treeNodesQueue.isEmpty()){
				root = treeNodesQueue.element();
				if(treeNodesQueue.element().getData() > maxElement){
					maxElement = treeNodesQueue.element().getData();
				}
				if(root.leftNode != null){
					treeNodesQueue.add(root.leftNode);
				}
				if(root.rightNode != null){
					treeNodesQueue.add(root.rightNode);
				}
				
				treeNodesQueue.remove();
			}
			return maxElement;
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
		
		MaxMinElementInBTreeWithoutRecursion elementInBTreeWithoutRecursion = new MaxMinElementInBTreeWithoutRecursion();
		Scanner scanner  = new Scanner(System.in);
		char ch=' ' ;
		do {
			System.out.println("Press 1 to insert element : ");
			System.out.println("Press 2 to find maximum element : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:System.out.println("Enter integer element to insert");
			elementInBTreeWithoutRecursion.insertDataIntoTree(scanner.nextInt());
				
				break;
			
			case 2:	System.out.println("Maximum Element in tree is --> "+elementInBTreeWithoutRecursion.findMaxMinElement());
				break;

			default:
				break;
			}
			
		System.out.println("Do you want to continue:: ");
		ch = scanner.next().charAt(0);
		} while (ch=='y' || ch=='Y');
		
	
	}
	

}
