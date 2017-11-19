public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sublist = new ArrayList();
            for(int i=0;i<level;i++){
                TreeNode temp = queue.poll();
                sublist.add(temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            list.add(sublist);
        }
        return list;
    }
