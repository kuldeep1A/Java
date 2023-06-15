package src;

public class kthSmallest extends BTree {
    public static int kthSmallest1(Node root, int key){
        traverse(root, key);
        return ans;
    }
    private static int rank = 0;
    private static int ans = -1;

    private static void traverse(Node root, int k){
        if (root == null){
            return;
        }
        traverse(root.left, k);
        if (++rank == k){
            ans = root.data;
            return;
        }
        traverse(root.right, k);
    }

    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);

        int res = kthSmallest1(tree.root, 3);
        System.out.println(res);
    }
}
