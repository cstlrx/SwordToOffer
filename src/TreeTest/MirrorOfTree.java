package TreeTest;

/**
 * Created by lrx on 2017/4/10.
 */
// 求一棵树的镜像
public class MirrorOfTree {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode p = root.left;
        root.left = root.right;
        root.right = p;
        Mirror(root.left);
        Mirror(root.right);
    }
}
