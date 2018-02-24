public class MyClass {
    public TreeNode search(TreeNode root, int val){
        if(root==null) return new TreeNode(val);
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for(int i=0;i<level;i++){
                    TreeNode temp = q.poll();
                    if(temp.left!=null){
                      q.offer(temp.left);  
                    } 
                    else{
                        temp.left = new TreeNode(val);
                        return root;
                    }
                    if(temp.right!=null) q.offer(temp.right);
                    else{
                        temp.right = new TreeNode(val);
                        return root;
                    }
                }
            }
            return root;
    }
}
