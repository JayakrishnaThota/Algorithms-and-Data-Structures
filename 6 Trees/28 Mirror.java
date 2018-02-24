//O(n) time and space
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return helper(p.left,q.right) && helper(p.right,q.left);
    }
}
