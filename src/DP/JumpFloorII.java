package DP;

/**
 * Created by lrx on 2017/4/9.
 */
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class JumpFloorII {
    public int JumpFloorII(int n) {
        if (n <= 0) return 0;
//        用数组保存中间结果
//        每次状态都由前两次状态决定
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            for (int j=0; j<i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[n];
    }
}
