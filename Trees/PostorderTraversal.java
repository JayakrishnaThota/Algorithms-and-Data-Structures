public void recPostorder(TreeNode root){
  if(root!=null){
    recPostorder(root.left);
    recPostorder(root.right);
    System.out.println(root.val);
  }
}

public List<Integer> Inorder(TreeNode root){
  List<Integer> result = new ArrayList();
  if(root==null) return result;
  Stack<TreeNode> stack = new Stack();
  TreeNode cur = root;
  boolean done = false;
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
        result.add(cur.val);
        cur = cur.right;
      }
    }
  }
  return result;
}
