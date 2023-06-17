package src;

import java.util.ArrayList;
import java.util.List;

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
    private static List<Integer> ans = new ArrayList<>();
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
    public static void main(String[] args) {
        TreeNodeR root = new TreeNodeR(1);
        root.left = new TreeNodeR(2);
        root.right = new TreeNodeR(3);
        root.left.left = new TreeNodeR(4);
        root.left.right = new TreeNodeR(5);
        root.right.left = new TreeNodeR(6);
        root.right.right = new TreeNodeR(7);

        List<Integer> result = _rightSideView(root);
        System.out.println(result);
    }
}
