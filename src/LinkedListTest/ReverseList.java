package LinkedListTest;

/**
 * Created by lrx on 2017/4/10.
 */
// 反转链表
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        ListNode lastNode = null;
        while (p != null) {
            if (p.next == null) {
                p.next = lastNode;
                return p;
            }
            ListNode q = p;
            p = p.next;
            q.next = lastNode;
            lastNode = q;
        }
        return p;
    }
}
