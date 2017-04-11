package TreeTest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lrx on 2017/4/11.
 */
// 层级遍历，用队列,类似广度优先遍历
public class TreeFloorPrint {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode p = queue.removeFirst();
            res.add(p.val);
            if (p.left != null)
                queue.add(p.left);
            if (p.right != null)
                queue.add(p.right);
        }
        return res;
    }
}
