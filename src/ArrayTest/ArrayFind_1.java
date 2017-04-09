package ArrayTest;

/**
 * Created by lrx on 2017/4/9.
 */
public class ArrayFind_1 {
    public static void main(String[] args) {
        int[][] arr = new int[0][0];
        System.out.println(arr.length);
    }
    public boolean Find(int target, int[][] array) {
        if (array.length == 0) {
            return false;
        }
        int row = 0;
        int col = array.length-1;
        while (true) {
            if (array[row][col] < target) row++;
            else if (array[row][col] > target) col--;
            else {
                return true;
            }
            if (row == array.length || col < 0) return false;
        }
    }
}
