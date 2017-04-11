package StackQueueTest;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/11.
 */
// 栈的压入弹出序列
public class StackIsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (popA.length != pushA.length) return false;
        // 辅助栈
        Stack<Integer> stack = new Stack<>();
        int pushPos = 0;
        int popPos = 0;
        while (popPos != popA.length) {
            while (!stack.isEmpty() && stack.peek() == popA[popPos]) {
                stack.pop();
                popPos++;
            }
            if (pushPos != pushA.length)
                stack.push(pushA[pushPos++]);
            else if (popPos != popA.length)
                return false;
        }
        return true;
    }
}
