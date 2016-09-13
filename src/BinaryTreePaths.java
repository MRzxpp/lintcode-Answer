import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhongsz on 2016/9/13.
 */
public class BinaryTreePaths {

    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) {
            paths.add("");
            return paths;
        }

        return paths;

    }

    public static void main(String args[]) {
        TreeNode root = null;
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        System.out.println(binaryTreePaths.binaryTreePaths(root));
    }

}
