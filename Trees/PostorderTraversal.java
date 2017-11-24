public void recPostorder(TreeNode root){
  if(root!=null){
    recPostorder(root.left);
    recPostorder(root.right);
    System.out.println(root.val);
  }
}

public List<Integer> Postorder(TreeNode root){
  List<Integer> result = new ArrayList();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        TreeNode prev = null;
        while(!stack.isEmpty()){
        //Check if traversing down
            TreeNode cur = stack.peek();
            if(prev==null || prev.left==cur || prev.right==cur){
              if(cur.left!=null)
                stack.push(cur.left);
              else if(cur.right!=null)
                stack.push(cur.right);
            }
            else if(cur.left==prev){
              if(cur.right!=null)
                stack.push(cur.right);
            }
            else{
              result.add(cur.val);
              stack.pop();
            }
            prev = cur;
          }
          return result;
}
