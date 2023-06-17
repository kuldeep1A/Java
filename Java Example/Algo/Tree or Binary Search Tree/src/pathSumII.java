package src;
import java.util.ArrayList;
import java.util.List;
public class pathSumII extends OwnBTree {
    public pathSumII(int data){
        super(data);
    }

    public static List<List<Integer>> _pathSumII(OwnBTree root, int targetSum){
        List<List<Integer>> paths = new ArrayList<>();
        dfs(root, new ArrayList<>(), targetSum, paths);
        return paths;
    }

    private static void dfs(OwnBTree root, List<Integer> path, int targetSum, List<List<Integer>> paths){
        if (root == null)
            return;

        if (root.data == targetSum && root.left == null && root.right == null){
            path.add(root.data);
            paths.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        path.add(root.data);
        dfs(root.left, path, targetSum - root.data, paths);
        dfs(root.right, path, targetSum - root.data, paths);

        path.remove(path.size() - 1);
    }


    public static void main(String[] args) {
        pathSumII tree = new pathSumII(5);

//        Given the root of a binary tree and an integer targetSum,
//        return all root-to-leaf paths where the sum of the node values in
//        the path equals targetSum. Each path should be returned as a list of
//        the node values, not node references.

        tree.left = new OwnBTree(4);
        tree.left.left = new OwnBTree(11);
        tree.left.left.left = new OwnBTree(7);
        tree.left.left.right = new OwnBTree(2);
        tree.right = new OwnBTree(8);
        tree.right.left = new OwnBTree(13);
        tree.right.right = new OwnBTree(4);
        tree.right.right.left = new OwnBTree(5);
        tree.right.right.right = new OwnBTree(1);

        List<List<Integer>> res = _pathSumII(tree, 22);
        for (List<Integer> path: res){
            System.out.println(path);
        }
    }
}
