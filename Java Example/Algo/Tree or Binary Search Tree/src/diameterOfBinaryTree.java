package src;
class OwnBTree{
    int data;
    OwnBTree left;
    OwnBTree right;
    OwnBTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class diameterOfBinaryTree {
    private static int ans = 0;
    public static int _diameterOfBinaryTree(OwnBTree root){
        maxDepth(root);
        return ans;
    }
    static int maxDepth(OwnBTree root){
        if (root == null){
            return 0;
        }
        final int left = maxDepth(root.left);
        final int right = maxDepth(root.right);
        ans = Math.max(ans, left + right);

        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        OwnBTree root = new OwnBTree(1);
        root.left = new OwnBTree(2);
        root.right = new OwnBTree(3);
        root.left.left = new OwnBTree(4);
        root.left.right = new OwnBTree(5);

        int ans = _diameterOfBinaryTree(root);

        System.out.println(ans);
    }
}
