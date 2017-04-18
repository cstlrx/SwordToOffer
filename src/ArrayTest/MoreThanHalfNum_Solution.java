package ArrayTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lrx on 2017/4/17.
 */
// 数组中超过数组一半的数字
public class MoreThanHalfNum_Solution {
    public static void main(String[] args) {
        int n = moreThanHalfNum_Solution(new int[] {1,2,3,2,2,2,5,4,2});
        System.out.println(n);
    }
    public static  int moreThanHalfNum_Solution(int [] array) {

        int times = 1;
        int cur = array[0];
        for (int i=1; i<array.length; i++) {
            if (cur == array[i]) {
                times++;
            } else {
                times--;
                if (times == 0) {
                    cur = array[i];
                    times = 1;
                }
            }
        }
        int num = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == cur)
                num++;
        }
        return num > array.length/2 ? cur: 0;
    }
}
