package TreeTest;

/**
 * Created by lrx on 2017/4/10.
 */
// 判断一棵树是否是另一颗树的子结构
public class JudgeSubTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(6);
        root1.right = new TreeNode(7);
        TreeNode root2 = new TreeNode(8);
        JudgeSubTree j = new JudgeSubTree();
        boolean r = j.HasSubtree(root1, root2);
        System.out.println(r);
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 ==null || root2 == null)
            return false;
        return preOrder(root1,root2);
    }
//    先序遍历找到第一个相同的节点
    private boolean res = false;
    private boolean preOrder(TreeNode root1, TreeNode root2) {
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            res = judge(root1,root2);
            if (res)
                return true;
        }
        return preOrder(root1.left,root2) || preOrder(root1.right,root2);
    }
    // 递归判断两个树是否相等
    private boolean judge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null) return false;
        if (root2 == null) return true;

        if (root1.val == root2.val) {
            return judge(root1.left,root2.left) && judge(root1.right,root2.right);
        } else {
            return false;
        }
    }


}
