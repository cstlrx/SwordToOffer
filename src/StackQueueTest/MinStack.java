package StackQueueTest;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/10.
 */
// 最小栈
public class MinStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        if (min.isEmpty())
            min.push(node);
        else {
            int m = min.peek();
            if (node <= m) {
                min.push(node);
            } else {
                min.push(min.peek());
            }
        }
        stack1.push(node);
    }

    public void pop() {
        stack1.pop();
        min.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return min.peek();
    }
}
