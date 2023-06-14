package src;
public class deleteNode extends BTree {
    public static Node deleteNode1(Node root, int key){
        if (root == null)
            return null;

        if (root.data == key){
            // Case 1
            if (root.left == null)
                return root.right;

            // Case 2
            if (root.right == null)
                return root.left;

            // Case 3
            Node minNode = getMin(root.right);
            root.right = deleteNode1(root.right, minNode.data);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;

        } else if (root.data < key){
            root.right = deleteNode1(root.right, key);
        } else {
            root.left = deleteNode1(root.left, key);
        }
        return root;
    }
    public static Node getMin(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        // Input: root = [5,3,6,2,4,null,7], key = 3,7
        insert(5);
        insert(3);
        insert(6);
        insert(2);
        insert(4);
        insert(7);
        Node res = deleteNode1(root, 7);
        levelOrder(res);

    }
}
