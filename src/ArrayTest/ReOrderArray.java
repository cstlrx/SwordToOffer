package ArrayTest;

import java.util.Arrays;

/**
 * Created by lrx on 2017/4/10.
 */
// 调整数组顺序使奇数位于偶数前面
public class ReOrderArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7};
        reOrderArray(arr);
    }
    public static void reOrderArray(int[] array) {
        int[] temp = new int[array.length];
        int oddPos = 0;
        int evePos = array.length-1;
        int index1 = 0;
        int index2 = array.length-1;
        while (oddPos != array.length || evePos != -1) {
            if (array[oddPos] % 2 != 0) {
                temp[index1++] = array[oddPos];
            }
            if (array[evePos] % 2 == 0) {
                temp[index2--] = array[evePos];
            }
            oddPos++;
            evePos--;
        }
        for (int i=0; i<array.length; i++) {
            array[i] = temp[i];
        }
    }
}
