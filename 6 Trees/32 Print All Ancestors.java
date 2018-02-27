package Trees;

class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class PrintAllAncestors {

    public static boolean print(TreeNode root, int target){
        if(root==null) return false;
        if(root.val==target) return true;
        if(print(root.left, target) || print(root.right, target)) {
            System.out.println(root.val);
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        print(root, 7);
    }
}
