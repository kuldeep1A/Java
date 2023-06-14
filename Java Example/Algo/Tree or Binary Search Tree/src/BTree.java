package src;

import java.util.*;
import java.util.LinkedList;

public class BTree {
    static Node root;
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void insert(int val){
        Node newNode = new Node(val);
        if (root == null){
            root = newNode;
            return;
        }
        Node curr = root;
        while (true) {
            if (val < curr.data){
                if (curr.left == null){
                    curr.left = newNode;
                    return;
                }
                curr = curr.left;
            } else {
                if (curr.right == null){
                    curr.right = newNode;
                    return;
                }
                curr = curr.right;
            }
        }
    }

    public static void preorder(Node root, String path){
        if (root == null)
            return;

        System.out.print(path + root.data);
        preorder(root.left, "-left-");
        preorder(root.right, "-right-");
    }

    public static void inorder(Node root, String path){
        if (root == null)
            return;

        inorder(root.left, "-left-");
        System.out.print(path +  root.data);
        inorder(root.right, "-right-");
    }

    public static void postorder(Node root, String path){
        if (root == null)
            return;

        postorder(root.left, "-left-");
        postorder(root.right, "-right-");
        System.out.print(path + root.data);
    }

    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        if (root != null)
            queue.add(null);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if (current == null){
                System.out.println();
                if (queue.isEmpty()){
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(current.data + " .. ");
                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    public static List<List<Integer>> levelOrder2(Node root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if (root == null)
            return res;

        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < len; i++){
                Node curr = queue.poll();
                assert curr != null;
                level.add(curr.data);
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
            }
            res.add(level);
        }

        return res;
    }

    public static void main(String[] args) {
        insert(5);
        insert(1);
        insert(3);
        insert(4);
        insert(2);
        insert(7);
        System.out.println("Preorder: ");
        preorder(root, "-main-");
        System.out.println("Inorder: ");
        inorder(root, "-main-");
        System.out.println("Postorder: ");
        postorder(root, "-main-");
        System.out.println("levelOrder: ");
        levelOrder(root);
        System.out.println("levelOrder2: ");
        List<List<Integer>> res =  levelOrder2(root);
        for (List<Integer> ele: res)
            System.out.println(Arrays.toString(new List[]{ele}));

    }
}
