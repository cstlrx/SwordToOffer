package TreeTest;

/**
 * Created by lrx on 2017/4/12.
 */
// 二叉搜索树转双向链表，中序遍历
public class ConvertBSTToLinkedList {
    TreeNode tail;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode res = pRootOfTree;
        while (res.left != null) {
            res = res.left;
        }
        tail = null;
        inOrder(pRootOfTree);
        return res;
    }
    private void inOrder (TreeNode root) {
        if (root == null) return;
        TreeNode cur = root;
        inOrder(root.left);
        if (tail == null) {
            tail = cur;
        } else {
            tail.right = cur;
            cur.left = tail;
            tail = cur;
        }
        inOrder(root.right);
    }
}
