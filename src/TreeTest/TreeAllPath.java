package TreeTest;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/4/11.
 */
// 二叉树所有路径之和为某值，采用递归实现
public class TreeAllPath {
    public static void main(String[] args) {
        TreeAllPath t = new TreeAllPath();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        ArrayList<ArrayList<Integer>> res = t.FindPath(root, 22);
        System.out.println(res);
    }
    ArrayList<ArrayList<Integer>> res;
    ArrayList<Integer> aPath;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        res = new ArrayList<>();
        if (root == null) return res;
        aPath = new ArrayList<>();
        findPath(root, target);
        return res;
    }
    private void findPath(TreeNode root, int target) {
        if (root == null) return;
        aPath.add(root.val);
        // 是叶子结点
        if (root.left == null && root.right == null) {
            int sum = 0;
            for (Integer i : aPath) {
                sum += i;
            }
            if(sum == target) {
//                res.add(aPath);这样不行，可能因为res持有apath的引用，而之后aPath还会改变
                ArrayList<Integer> r = new ArrayList<>();
                for (Integer i : aPath) {
                    r.add(i);
                }
                res.add(r);
            }
            aPath.remove(aPath.size()-1);
            return;
        }
        findPath(root.left, target);
        findPath(root.right, target);
        aPath.remove(aPath.size()-1);
    }
}
