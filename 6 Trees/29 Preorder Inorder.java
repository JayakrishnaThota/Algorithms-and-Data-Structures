//O(n) time and space
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0,preorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode helper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        //Find the index of preorder[ps] in inorder
        int offset = is;
        for(;offset<=ie;offset++){
            if(inorder[offset]==preorder[ps])
                break;
        }
        root.left = helper(preorder, ps+1,ps+offset-is,inorder, is, offset-1);
        root.right = helper(preorder, ps+offset-is+1, pe, inorder,offset+1,ie);
        return root;
    }
}
