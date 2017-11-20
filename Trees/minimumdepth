class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        int depth = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for(int i=0;i<level;i++){
                TreeNode temp = queue.poll();
                if(temp.left==null && temp.right==null) return depth+1;
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            depth++;
        }
        return depth;
    }
}
