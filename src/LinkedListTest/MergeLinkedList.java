package LinkedListTest;

/**
 * Created by lrx on 2017/4/10.
 */
// 合并两个递增排序链表，采用递归实现
public class MergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val >= list2.val) {
            list2.next = Merge(list1, list2.next);
            return list2;
        } else {
            list1.next = Merge(list1.next, list2);
            return list1;
        }
    }
}
