package src;

public class maxDepth extends BTree {
    public static int max_depth(Node root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(max_depth(root.left), max_depth(root.right));
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
        int max_depth = max_depth(tree.root);
        System.out.println(max_depth);
    }
}
