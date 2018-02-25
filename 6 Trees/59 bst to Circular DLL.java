package Trees;

//Given a bst root, convert these elements into a circular dll
//The order of the elements must be in inorder
public class bsttoCircularDLL {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static class DLNode{
        int val;
        DLNode prev, next;

        public DLNode(int val){
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public DLNode convert(TreeNode root){
        if(root==null) return null;
        DLNode left = convert(root.left);
        DLNode right = convert(root.right);
        DLNode head = new DLNode(root.val);
        head.prev = head.next = head;
        return concatenate(concatenate(left,head),right);
    }

    public DLNode concatenate(DLNode leftList,DLNode rightList)
    {
        if (leftList == null)
            return rightList;
        if (rightList == null)
            return leftList;
        DLNode leftLast = leftList.prev;
        DLNode rightLast = rightList.prev;
        leftLast.next = rightList;
        rightList.prev = leftLast;
        leftList.prev = rightLast;
        rightLast.next = leftList;
        return leftList;
    }
}
