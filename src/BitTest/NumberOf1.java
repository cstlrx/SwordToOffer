package BitTest;

/**
 * Created by lrx on 2017/4/10.
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int res = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                res++;
            }
            flag <<= 1;
        }
        return res;
    }
}
