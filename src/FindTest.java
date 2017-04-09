/**
 * Created by lrx on 2017/4/9.
 */
//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//        输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
public class FindTest {
    public static void main(String[] args) {
        int res = minNumberInRotateArray(new int[]{6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335});
        System.out.println(res);
    }
    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        if (array[0] <= array[array.length-1]) return array[0];
        int l = 0;
        int r = array.length-1;
        while (l < r) {
            if (r - l == 1){
                return array[r];
            }
            int mid = l + (r-l) / 2;
            // 出现三者相同的情况
            if ((array[l] == array[r]) && (array[r] == array[mid])) {
                for(int i=0; i<array.length-1; i++){
                    if(array[i] > array[i+1]){
                        return array[i+1];
                    }
                }
            }
            if (array[mid] >= array[l]) {
                l = mid;
            } else if (array[mid] <= array[r]){
                r = mid;
            }
        }
        return 0;
    }
}
