//O(n) time and space
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = inorderTraversal(root);
        return list.get(k-1);
    }
      public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack();
        boolean done = false;
        TreeNode cur = root;
        while(!done){
            if(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                if(stack.isEmpty())
                    done = true;
                else{
                    cur = stack.pop();
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        return list;
    }
}
