import java.util.Scanner;

/**
 * Created by lrx on 2017/4/11.
 */
// 有一个整数n，将n分解成若干个不同自然数之和，问如何分解能使这些数的乘积最大，输出这个乘积m
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        while(sc.hasNext()){
            int n = sc.nextInt();
            int total = 0;
            int i = 2;
            while(total + i <= n){
                total += i;
                arr[i-2] = i;
                ++i;
            }
            n -= total;
            i = i-3;
            total = i;
            while(i >= 0 && n > 0){
                --n;
                arr[i]++;
                --i;
            }
            if(n>0){
                arr[total]++;
            }
            int res = 1;
            for(i = 0 ; i <= total ; ++i){
                res *= arr[i];
            }
            System.out.println(res);
        }
    }
}
