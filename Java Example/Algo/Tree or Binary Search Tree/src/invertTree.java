package src;

public class invertTree extends BTree {
    public static Node invert(Node root){
        if (root == null){
            return null;
        }

        Node left = root.left;
        Node right = root.right;
        root.left = invert(right);
        root.right = invert(left);

        return root;
    }
    public static void main(String[] args) {
        invertTree tree = new invertTree();

        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);

        tree.preorderTraversal();

        tree.root = invert(tree.root);
        System.out.println();

        tree.preorderTraversal();

    }
}
