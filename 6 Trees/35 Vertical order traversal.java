//O(n) time and space
class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root==null) return list;
        Map<Integer, List<Integer>> map = new HashMap();
        Queue<TreeNode> q = new LinkedList();
        Queue<Integer> columns = new LinkedList();
        q.offer(root);
        columns.offer(0);
        int min = 0, max = 0;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            int line = columns.poll();
            if(map.get(line)==null){
                map.put(line, new ArrayList<Integer>());
            }
            map.get(line).add(node.val);
            if(node.left!=null){
                q.offer(node.left);
                columns.add(line-1);
                min = Math.min(min, line-1);
            }
            if(node.right!=null){
                q.offer(node.right);
                columns.add(line+1);
                max = Math.max(max, line+1);
            }
        }
        for(int i=min;i<=max;i++){
            list.add(map.get(i));
        }
        return list;
    }
}
