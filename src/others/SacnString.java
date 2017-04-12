package others;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by lrx on 2017/4/12.
 */
// 将一个a1b2c3d4ef5g6的字符串解析，打印a=1 b =2 c =3 d = 4.....
public class SacnString {
    public static void main(String[] args) {
        Map m = scanString("a1b2c3d4ef5g6");
        System.out.println(m);
    }
    public static Map<String, Integer> scanString(String str) {
        Map<String, Integer> map = new TreeMap<>();
        char[] arr = str.toCharArray();
        StringBuilder chars;
        int num;
        int pos = 0;
        while (pos < arr.length) {
            chars = new StringBuilder();
            num = 0;
            while (Character.isLetter(arr[pos])) {
                chars.append(arr[pos]);
                pos++;
            }
            while (pos < arr.length && Character.isDigit(arr[pos])) {
                num = num * 10 + arr[pos] - '0';
                pos++;
            }
            map.put(chars.toString(), num);
        }
        return map;
    }
}
