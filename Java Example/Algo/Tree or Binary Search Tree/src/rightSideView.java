package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodeR{
    int data;
    TreeNodeR left;
    TreeNodeR right;
    public TreeNodeR(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Given the root of a binary tree, imagine yourself standing on the right side of it,
// return the values of the nodes you can see ordered from top to bottom.
public class rightSideView {
    private static final List<Integer> ans = new ArrayList<>();
    public static List<Integer> _rightSideView(TreeNodeR root){
        dfs(root, 0);
        return ans;
    }
    private static void dfs(TreeNodeR node, int depth){
        if (node == null)
            return;

        if (depth == ans.size()){
            ans.add(node.data);
        }

        dfs(node.right, depth + 1);
        dfs(node.left, depth + 1);
    }

    public static List<Integer> _rightSideView_bfs(TreeNodeR root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNodeR> queue = new LinkedList<>();
        if (root == null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNodeR node = queue.poll();

                if (i == size - 1){
                    assert node != null;
                    list.add(node.data);
                }
                assert node != null;
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNodeR root = new TreeNodeR(1);
        root.left = new TreeNodeR(2);
        root.right = new TreeNodeR(3);
        root.left.left = new TreeNodeR(4);
        root.left.right = new TreeNodeR(5);
        root.right.left = new TreeNodeR(6);
        root.right.right = new TreeNodeR(7);

        List<Integer> result = _rightSideView(root);
        System.out.println("using dfs: " + result);
        result = _rightSideView_bfs(root);

        System.out.println("using bfs: " + result);
    }
}
