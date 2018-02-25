package Trees;

public class bst {
    public static class TreeNode{
        int val;
        TreeNode left, right;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    //O(n) worst case and O(logn) average case
    public TreeNode search(TreeNode root, int data){
        while(root!=null){
            if(root.val == data) return root;
            else if(root.val<data) root=root.right;
            else root = root.left;
        }
        return root;
    }

    //O(n) worst and O(logn) average
    public TreeNode min(TreeNode root){
        if(root==null) return null;
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    //O(n) worst and O(logn) average
    public TreeNode max(TreeNode root){
        if(root==null) return null;
        while (root.right!=null){
            root = root.right;
        }
        return root;
    }

    //O(n) worst and O(logn) average
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        TreeNode prev = null;
        while(cur!=null && cur.val!=key){
            prev = cur;
            if(cur.val>key){
                cur = cur.left;
            }
            else{
                cur = cur.right;
            }
        }
        if(prev==null) return helper(root);
        else{
            if(prev.left == cur)
                prev.left = helper(cur);
            else if(prev.right==cur)
                prev.right = helper(cur);
        }
        return root;
    }
    private TreeNode helper(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        TreeNode next = root.right;
        TreeNode pre = null;
        for(; next.left != null; pre = next, next = next.left);
        next.left = root.left;
        if(root.right != next) {
            pre.left = next.right;
            next.right = root.right;
        }
        return next;
    }

    //O(n) worst and O(logn) average
    public TreeNode insert(TreeNode root, int val){
        if(root==null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val<val){
            root.right = insert(root.right, val);
        }
        else{
            root.left = insert(root.left, val);
        }
        return root;
    }
}
