package StringTest;

import java.util.Arrays;

/**
 * Created by lrx on 2017/4/9.
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String res = replaceSpace(new StringBuffer("hello world"));
        System.out.println(res);
    }
    public static String replaceSpace(StringBuffer str) {
        char[] arr = str.toString().toCharArray();
        int numOfSpace = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                numOfSpace++;
            }
        }
        char[] res = new char[arr.length + numOfSpace*2];
        int posRes = res.length-1;
        int posArr = arr.length-1;
        while (posArr >= 0) {
            if (arr[posArr] == ' ') {
                posArr--;
                res[posRes--] = '0';
                res[posRes--] = '2';
                res[posRes--] = '%';
            } else {
                res[posRes--] = arr[posArr--];
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<res.length; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
