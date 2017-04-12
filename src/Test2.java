import java.util.Scanner;

/**
 * Created by lrx on 2017/4/11.
 */
//拼图，是一个老少皆宜的益智游戏，在打乱的3*3的范围中，玩家只能每次将空格(0)和相邻的数字格（上、下、左、右）交换，最终调整出一个完整的拼图。
//        完整拼图为：
//        1 2 3
//        4 5 6
//        7 8 0
public class Test2 {

    static int run(String numbers){
return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = new String();
        for(int rows=3; rows>0; rows--){
            for(String n: scan.nextLine().split(" ")){
                numbers += n;
            }
        }
        int res = run(numbers);
        System.out.println(String.valueOf(res));
    }

}
