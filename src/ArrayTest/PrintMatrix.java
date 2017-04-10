package ArrayTest;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/4/10.
 */
// 顺时针打印矩阵
public class PrintMatrix {
    // 打印矩阵第i层
    private void print(int[][] arr, int s, ArrayList<Integer> res) {
        // 打印最上行
        for (int i=s; i<arr[s].length-s; i++) {
            res.add(arr[s][i]);
        }
//        打印最右列
        for (int i=s+1; i<arr.length-s-1; i++) {
            res.add(arr[i][arr[0].length-1-s]);
        }
//        打印最下行，若只有一行则不执行
        if (arr.length-1-s != s)
            for (int i = arr[0].length - 1 - s; i >= s; i--) {
                res.add(arr[arr.length - 1 - s][i]);
            }
//        打印最左列，若只有一列，不用执行
        if (arr[0].length - 1 - s != s)
            for (int i = arr.length - s - 2; i >= s + 1; i--) {
                res.add(arr[i][s]);
            }
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int length = Math.min(matrix.length,matrix[0].length);
        if (length % 2 == 0) length /= 2;
        else length = length / 2 + 1;
        for(int i=0; i<length; i++) {
            print(matrix, i, res);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res;
        PrintMatrix p = new PrintMatrix();
        res = p.printMatrix(new int[][]{{1,2},{3,4},{5,6},{7,8},{9,10}});
        System.out.println(res);
    }
}
