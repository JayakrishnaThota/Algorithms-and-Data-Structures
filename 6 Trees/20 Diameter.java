//O(n2) time and O(n) space
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        max = Math.max(max, left+right);
        return Math.max(left,right)+1;
    }
}
