package LinkedListTest;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lrx on 2017/4/9.
 */
 class ListNode {
        int val;
        ListNode next = null;
            ListNode(int val) {
            this.val = val;
        }
}
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode p = listNode;
        while (p != null) {
            res.add(p.val);
            p = p.next;
        }
        Collections.reverse(res);
        return res;
    }
}
