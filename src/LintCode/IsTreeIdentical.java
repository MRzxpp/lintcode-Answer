package LintCode;

/**
 * Created by Zhongsz on 2016/9/22.
 * 两二叉树是否等价
 */


// * Definition of LintCode.TreeNode:
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class IsTreeIdentical {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    private boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        return helper(a, b);
    }

    private boolean result = false;

    private boolean helper(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if ((a == null && b != null) || (a != null && b == null)) {
            return false;
        }

        if (a.val == b.val
//                && a.left == b.left && a.right == b.right
                ) {
            if (a.left == null && a.right == null) {
                result = true;
            }
            if ((a.left == null && b.left != null) || (a.right == null && b.right != null) || (a.left != null && b.left == null) || (a.right != null && b.right == null)) {
                result = false;
                return false;
            }
            if (a.left != null) {
                result = helper(a.left, b.left);
                if (result && a.right != null)
                    result = helper(a.right, b.right);
            }
            if (a.left == null && a.right != null) {
                result = helper(a.right, b.right);
            }

        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        b.left.right = new TreeNode(4);
        IsTreeIdentical isTreeIdentical = new IsTreeIdentical();
        System.out.println(isTreeIdentical.isIdentical(a, b));

    }
}
