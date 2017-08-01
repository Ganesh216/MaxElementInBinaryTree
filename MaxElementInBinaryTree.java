package com.dataStructure.tree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MaxElementInBinaryTree {

	private BinaryTreeNode root;
	
	MaxElementInBinaryTree(){
		root=null;
	}
	public void findMaxElement(){
		Set<Integer> set = new HashSet<Integer>();
		findMaxElemenTemp(root,set);
		TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
		System.out.println("Maximum element is ---> "+treeSet.last());
		System.out.println("Minumum element is ---> "+treeSet.first());
	}
	
	private static void findMaxElemenTemp(BinaryTreeNode rootNode,Set<Integer> set) {
		if(rootNode != null){
			findMaxElemenTemp(rootNode.leftNode,set);
			set.add(rootNode.getData());
			System.out.println("-->"+rootNode.getData());
			findMaxElemenTemp(rootNode.rightNode,set);
		}
		
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
		
		MaxElementInBinaryTree maxElementInBinaryTree = new MaxElementInBinaryTree();
		Scanner scanner  = new Scanner(System.in);
		char ch=' ' ;
		do {
			System.out.println("Press 1 to insert element : ");
			System.out.println("Press 2 to find maximum element : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:System.out.println("Enter integer element to insert");
				   maxElementInBinaryTree.insertDataIntoTree(scanner.nextInt());
				
				break;
			
			case 2:	maxElementInBinaryTree.findMaxElement();
				
				break;

			default:
				break;
			}
			
		System.out.println("Do you want to continue:: ");
		ch = scanner.next().charAt(0);
		} while (ch=='y' || ch=='Y');
		
	
	}





	
}
