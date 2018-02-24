//O(n) time and space
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
            if(root==null) return list;
            Queue<TreeNode> q = new LinkedList();
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                List<Integer> sublist = new ArrayList();
                for(int i=0;i<level;i++){
                    TreeNode temp = q.poll();
                    sublist.add(temp.val);
                    if(temp.left!=null) q.offer(temp.left);
                    if(temp.right!=null) q.offer(temp.right);
                }
                list.add(sublist);
            }
            return list;
    }
}
