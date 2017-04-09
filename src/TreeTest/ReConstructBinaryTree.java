package TreeTest;

/**
 * Created by lrx on 2017/4/9.
 */
// 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }
    private static TreeNode reConstructBinaryTree(int[] pre, int l1, int r1, int[] in, int l2, int r2) {
        if (l1 > r1 || l2 > r2) return null;
        TreeNode root = new TreeNode(pre[l1]);
        int index = l2;
        while (index <= r2 && in[index] != pre[l1]) {
            index++;
        }
        if (index > r2) return null;
        root.left = reConstructBinaryTree(pre, l1+1, l1+index-l2, in, l2, index-1);
        root.right = reConstructBinaryTree(pre, l1+index-l2+1, r1, in, index+1, r2);
        return root;
    }
}
