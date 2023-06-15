package src;

public class isValidBST extends BTree {
    public static boolean isValidBST1(Node root){
        return dfs(root, null, null);
    }
    private static boolean dfs(Node root, Node minNode, Node maxNode){
        if (root == null)   return true;

        if (minNode != null && root.data <= minNode.data)   return false;
        if (maxNode != null && root.data >= maxNode.data)   return false;

        return dfs(root.left, minNode, root) && dfs(root.right, root, maxNode);
    }
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);
        tree.insert(6);

        System.out.println(isValidBST1(tree.root));

        BTree tree1 = new BTree();
        tree1.insertWrong(5);
        tree1.insertWrong(1);
        tree1.insertWrong(4);
        tree1.insertWrong(3);
        tree1.insertWrong(6);

        System.out.println(isValidBST1(tree1.root));
    }
}
