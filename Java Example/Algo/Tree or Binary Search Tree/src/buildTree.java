package src;
import java.util.Arrays;


// Given two integer arrays preorder and inorder where preorder is the preorder traversal
// of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
public class buildTree extends BTree {
    public static Node _buildTree(int[] preorder, int[] inorder){
        if (preorder.length == 0 && inorder.length == 0){
            return null;
        }

        Node root = new Node(preorder[0]);
        int mid = 0;
        for (int i = 0; i < inorder.length; i++){
            if (preorder[0] == inorder[i])  mid = i;
        }

        root.left = _buildTree(Arrays.copyOfRange(preorder, 1, mid + 1), Arrays.copyOfRange(inorder, 0, mid));
        root.right = _buildTree(Arrays.copyOfRange(preorder, mid + 1, preorder.length), Arrays.copyOfRange(inorder,mid + 1, inorder.length));

        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {1, 2, 3, 4, 5, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};

        Node res = _buildTree(preorder, inorder);

        BTree root = new BTree();
        root.updateRoot(res);
        root.preorderTraversal();
    }
}
