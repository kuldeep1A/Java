package src;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BTree{
    Node root;
    BTree() {
        root = null;
    }
    public void updateRoot(Node newRoot){
        root = newRoot;
    }
    public void insert(int data){
        root = insertRecursive(root, data);
    }

    public void insertWrong(int data){
        root = insertWrongRecursive(root, data);
    }
    public void inorderTraversal(){
        inorderTraversalRecursive(root);
    }

    private Node insertRecursive(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }

        if (data < root.data){
            root.left = insertRecursive(root.left, data);
        } else {
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }

    private void inorderTraversalRecursive(Node root){
        if (root != null){
            inorderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRecursive(root.right);
        }
    }

    private Node insertWrongRecursive(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }

        if (data < root.data){
            root.right = insertWrongRecursive(root.right, data);
        } else {
            root.left = insertWrongRecursive(root.left, data);
        }
        return root;
    }
}