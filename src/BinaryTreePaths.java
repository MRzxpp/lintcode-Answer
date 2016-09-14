import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhongsz on 2016/9/13.
 */
public class BinaryTreePaths {

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    int i = 0;

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            paths.add("");
            return paths;
        } else {
            if (root.left != null && root.right != null) {
                paths.add(i, String.valueOf(root.val) + "->");
                i++;
                paths.add(i, paths.get(i - 1) + String.valueOf(root.val));
                binaryTreePaths(root.left);
                binaryTreePaths(root.right);
            }
            if (root.left != null && root.right == null) {
                paths.add(i, String.valueOf(root.val) + "->");
                binaryTreePaths(root.left);
            }
            if (root.right != null && root.right == null) {
                paths.add(i, String.valueOf(root.val) + "->");
                binaryTreePaths(root.right);
            }
            if (root.left == null && root.right == null) {
                paths.add(i, String.valueOf(root.val));
            }
        }
        return paths;
    }

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        System.out.println(binaryTreePaths.binaryTreePaths(root));
    }

}
