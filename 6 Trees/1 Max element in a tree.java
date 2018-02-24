public class MyClass {
    public int max(TreeNode root){
        int max = Integer.MIN_VALUE;
        if(root==null) return max;
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for(int i=0;i<level;i++){
                    TreeNode temp = q.poll();
                    max = Math.max(max, tep.val);
                    if(temp.left!=null) q.offer(temp.left);
                    if(temp.right!=null) q.offer(temp.right);
                }
            }
            return max;
    }
}
