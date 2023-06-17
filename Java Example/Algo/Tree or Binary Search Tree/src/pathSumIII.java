package src;

public class pathSumIII extends OwnBTree{
    public pathSumIII(int data){
        super(data);
    }

    public static int _pathSumIII(OwnBTree tree, long target){
        if (tree == null)
            return 0;
        return dfs(tree, target) + _pathSumIII(tree.left, target) + _pathSumIII(tree.right, target);
    }
    private static int dfs(OwnBTree tree, long target){
        if (tree == null)
            return 0;

        return (target == tree.data ? 1 : 0) + dfs(tree.left, target - tree.data)
                + dfs(tree.right, target - tree.data);
    }
    public static void main(String[] args) {
//        [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
        pathSumIII tree = new pathSumIII(1000000000);
        tree.left = new OwnBTree(1000000000);
        tree.left.left = new OwnBTree(294967296);
        tree.left.left.left = new OwnBTree(1000000000);
        tree.left.left.left.left = new OwnBTree(1000000000);
        tree.left.left.left.left.left = new OwnBTree(1000000000);
//        tree.left = new OwnBTree(5);
//        tree.left.left = new OwnBTree(3);
//        tree.left.left.left = new OwnBTree(3);
//        tree.left.left.right = new OwnBTree(-2);
//        tree.left.right = new OwnBTree(2);
//        tree.left.right.right = new OwnBTree(1);
//        tree.right = new OwnBTree(-3);
//        tree.right.right = new OwnBTree(11);

        int ans = _pathSumIII(tree, 0);
        System.out.println(ans);

    }
}
