//O(n) time and space
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        helper(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public void helper(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
