
import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.println(arr2d[i][j]);
            }
        }
        int[] index1 = arr2d[0];
        int[] index2 = arr2d[1];
        int[] index3 = arr2d[arr2d.length - 1];

        int lastindex1 = index1[index1.length - 1];
        int lastindex2 = index2[index2.length - 1];
        int lastindex3 = index3[index3.length - 1];

        int sum = lastindex1 + lastindex2 + lastindex3;

        System.out.println("ผลรวมของสมาชิกตัวสุดท้ายของ Array 2 มิติ = " + sum);
    }
}
