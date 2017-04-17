package StringTest;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by lrx on 2017/4/17.
 */
// 字符串的全排列
    // 思路：依次交换当前字符和后面所有字符，递归
public class StringPermutation {
    public static void main(String[] args) {
        StringPermutation s = new StringPermutation();
        s.Permutation("abc");
    }
    TreeSet<String> res;
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> r = new ArrayList<>();
        if (str == null || str.length() == 0) return r;
        res = new TreeSet<>();
        permutation(str.toCharArray(), 0);

        for (String s : res) {
            r.add(s);
        }
        return r;
    }
    private void permutation(char[] arr, int index) {
        // 一个结果
        if (index == arr.length-1) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<arr.length; i++) {
                sb.append(arr[i]);
            }
            res.add(sb.toString());
            return;
        }
        for (int i=index; i<arr.length-1; i++) {
            swap (arr, index, i);
            permutation(arr, index+1);
            swap (arr, index, i);
        }
    }
    private void swap (char[] arr, int i, int j) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
