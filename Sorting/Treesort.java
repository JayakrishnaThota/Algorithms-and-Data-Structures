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
		if(nums==null || nums.length==0) return null;
        	return helper(nums,0,nums.length-1);
	}
	    public TreeNode helper(int[] nums, int low, int high){
		if(low>high) return null;
		int mid = low+(high-low)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums,low,mid-1);
		root.right = helper(nums,mid+1,high);
		return root;
	    }

	//Perform inorder traversal
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        boolean done = false;
        Stack<TreeNode> stack = new Stack();
        TreeNode cur = root;
        while(!done){
            if(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                if(stack.isEmpty()){
                    done = true;
                }
                else{
                    cur = stack.pop();
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return list;
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Kindly enter the length of the array you want to sort");
		int length = in.nextInt();
		int[] array = new int[length];
		System.out.println("Kindly enter the contents of the array");
		for(int i=0;i<length;i++){
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		treesort t = new treesort();
		TreeNode root = t.constructBST(array);
		List<Integer> result = t.inorderTraversal(root);
		for(int i=0;i<array.length;i++)
			System.out.println(result.get(i));
	}
}
