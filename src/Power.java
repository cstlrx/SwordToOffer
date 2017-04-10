/**
 * Created by lrx on 2017/4/10.
 */
public class Power {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        boolean flag = false;
        if (exponent < 0) {
            flag = true;
            exponent =-exponent;
        }
        double res = 1.0;
        for (int i=1; i<=exponent; i++) {
            res *= base;
        }
        return flag ? 1/res : res;
    }
}
