package LinkedListTest;

/**
 * Created by lrx on 2017/4/10.
 */
// 倒数第k个节点
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) return null;
        ListNode p = head;
        ListNode end = head;
        for (int i=0; i<k-1; i++) {
            end = end.next;
            if (end == null) return null;
        }
        while (end.next != null) {
            p = p.next;
            end = end.next;
        }
        return p;
    }
}
