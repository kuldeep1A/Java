package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder extends BTree {

    public static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) return result;
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++){
                Node current = queue.poll();
                assert current != null;
                level.add(current.data);
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            result.add(level);
        }

        return result;
    }
    public static void main(String[] args) {
        levelOrder tree = new levelOrder();
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(20);
        tree.insert(15);

        tree.inorderTraversal();
        System.out.println();
        List<List<Integer>> levels = levelOrderTraversal(tree.root);

        for (List<Integer> level: levels){
            System.out.println(level);
        }
    }
}
