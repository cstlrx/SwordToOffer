package TreeTest;

/**
 * Created by lrx on 2017/4/11.
 */
// 验证一个序列是一颗二叉搜索树的后序遍历序列
    // 只需递归判断子树也是二叉搜索树即可
public class VerifySquenceIsBST {
    public static void main(String[] args) {
        VerifySquenceIsBST v = new VerifySquenceIsBST();
        v.VerifySquenceOfBST(new int[] {2,4,3,6,8,7,5});
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length <= 1) return true;
        return verify(sequence, 0, sequence.length-1);
    }
    private boolean verify(int[] seq, int l1, int r1) {
        if ((r1-l1) <= 0) return true;
        int root = seq[r1];
        int index = l1;
        while (index < r1 && seq[index] < root) {
            index++;
        }
        for (int i=index; i<r1; i++) {
            if (seq[i] < root)
                return false;
        }
        return verify(seq, l1, index-1) && verify(seq, index, r1-1);
    }
}
