package src;
import java.util.ArrayList;
import java.util.List;

class TreeNodeD{
    int data;
    TreeNodeD left;
    TreeNodeD right;
    public TreeNodeD(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class depth_first_search {
    private static  List<Integer> list = new ArrayList<>();
    public static List<Integer> dfs(TreeNodeD root){
        traverse(root);
        return list;
    }
    private static void traverse(TreeNodeD root){
        if (root == null)
            return;

        list.add(root.data);
        traverse(root.left);
        traverse(root.right);
    }
    public static void main(String[] args) {
        TreeNodeD root = new TreeNodeD(1);
        root.left = new TreeNodeD(2);
        root.right = new TreeNodeD(3);
        root.left.left = new TreeNodeD(4);
        root.left.right = new TreeNodeD(5);
        root.right.left = new TreeNodeD(6);
        root.right.right = new TreeNodeD(7);

        List<Integer> result = dfs(root);
        System.out.println(result);
    }
}
