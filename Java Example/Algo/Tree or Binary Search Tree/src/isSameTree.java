package src;

public class isSameTree extends BTree {

    public static boolean _isSameTree(Node tree1, Node tree2){
        if (tree2 == null || tree1 == null){
            return tree1 == tree2;
        }
        return tree1.data == tree2.data && _isSameTree(tree1.left, tree2.left) && _isSameTree(tree1.right, tree2.right);
    }
    public static void main(String[] args) {
        isSameTree tree1 = new isSameTree();
        isSameTree tree2 = new isSameTree();

        tree1.insert(4);
        tree1.insert(2);
        tree1.insert(1);
        tree1.insert(3);
        tree1.insert(7);
        tree1.insert(9);
        tree1.insert(6);

        tree2.insert(4);
        tree2.insert(2);
        tree2.insert(1);
        // for false
        tree2.insert(3);
        tree2.insert(7);
        tree2.insert(9);
        tree2.insert(6);

        boolean result = _isSameTree(tree1.root, tree2.root);
        System.out.println(result);
    }
}
