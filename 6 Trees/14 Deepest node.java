public class MyClass {
    public int size(TreeNode root, int val){
        if(root==null) return null;
        TreeNode temp = null;
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for(int i=0;i<level;i++){
                    temp = q.poll();
                    if(temp.left!=null)  q.offer(temp.left);  
                    if(temp.right!=null) q.offer(temp.right);
                }
            }
            return temp;
    }
}
