//O(n) time and space
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        if(root==null) return list;
        helper(list,"",root);
        return list;
    }
    public void helper(List<String> list, String s, TreeNode root){
        if(root.left==null && root.right==null){
            list.add(s+root.val+"");
            return;
        }
        s+=root.val+"->";
        if(root.left!=null){
            helper(list,s,root.left);
        }
        if(root.right!=null){
            helper(list,s,root.right);
        }
    }
}
