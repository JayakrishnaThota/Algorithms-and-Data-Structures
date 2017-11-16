package sorting;

import java.util.Scanner;

public class treesort {
	class TreeNode{
		int data;
		TreeNode left, right;
		public TreeNode(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	//Cosntruct a bst with the array
	public TreeNode constructBST(int[] array){

	}
	//Perform inorder traversal
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Kindly enter the length of the array you want to sort");
		int length = in.nextInt();
		int[] array = new int[length];
		System.out.println("Kindly enter the contents of the array");
		for(int i=0;i<length;i++){
			array[i] = in.nextInt();
		}
		treesort t = new treesort();
		TreeNode root = t.constructBST(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
