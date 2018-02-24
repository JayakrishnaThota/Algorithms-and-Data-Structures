public class MyClass {
    public boolean search(TreeNode root, int val){
        if(root==null) return false;
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for(int i=0;i<level;i++){
                    TreeNode temp = q.poll();
                    if(temp.val==val) return true;
                    if(temp.left!=null) q.offer(temp.left);
                    if(temp.right!=null) q.offer(temp.right);
                }
            }
            return false;
    }
}
