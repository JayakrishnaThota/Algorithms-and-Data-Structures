//O(n) time and space
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return helper(root,sum);
    }
    public boolean helper(TreeNode root, int sum){
        if(root==null) return false;
        if(root.val==sum && (root.left==null && root.right==null)) return true;
        return (helper(root.left,sum-root.val) || helper(root.right,sum-root.val));
    }
}
