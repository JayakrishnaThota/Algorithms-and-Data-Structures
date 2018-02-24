//O(n) time and space
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
     public TreeNode helper(int[] postorder, int poststart, int postend, int[] inorder, int instart, int inend)
    {
        if(poststart>postend||instart>inend) return null;
        int data = postorder[postend];
        TreeNode curr = new TreeNode(data);
        int offset = instart;
        for(;offset<inend;offset++) { if(inorder[offset]==data) break; }
        curr.left = helper(postorder,poststart,poststart+offset-instart-1,inorder,instart,offset-1);
        curr.right = helper(postorder,poststart+offset-instart,postend-1,inorder,offset+1,inend);
        return curr;
    }
}
