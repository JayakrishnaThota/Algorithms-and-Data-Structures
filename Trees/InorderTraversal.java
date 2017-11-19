public void recInorder(TreeNode root){
  if(root!=null){
    recInorder(root.left);
    System.out.println(root.val);
    recInorder(root.right);
  }
}

public List<Integer> Inorder(TreeNode root){
  List<Integer> result = new ArrayList();
  if(root==null) return result;
  Stack<TreeNode> stack = new Stack();
  stack.push(root);
  while(!stack.isEmpty()){
    TreeNode temp = stack.pop();
    result.add(temp.val);
    if(temp.right!=null) stack.push(temp.right);
    if(temp.left!=null) stack.push(temp.left);
  }
  return result;
}
