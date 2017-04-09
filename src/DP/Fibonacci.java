package DP;

/**
 * Created by lrx on 2017/4/9.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
//        用数组保存中间结果
//        每次状态都由前两次状态决定
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public int Fibonacci2(int n) {
        // 迭代法
        if (n <= 0) return 0;
        int ll = 0;// 保存上上一次结果
        int l = 1;// 保存上一次结果
        int cur = 1; // 保存当前结果

        for (int i=2; i<=n; i++) {
            cur = ll + l;
            ll = l;
            l = cur;
        }
        return cur;
    }
}
