
import java.util.Scanner;

public class lab9_To_10 {

    public static void main(String[] args) {
        // Lab 9
        for (int count = 1; count <= 20; count++) {
            if (count == 11) {
                System.out.println("\nแสดงผลของ Count เมื่อมีค่าเท่า 11 ");
                continue;
            }
        }
        System.out.println("");
        System.out.println("################");

        // Lab10
        System.out.print("แสดงผลของ Count ตั้งแต่ 1-10 ยกเว้น 2 ==> ");
        for (int count = 1; count <= 10; count++) {
            if (count == 2) {
                continue;
            }
            System.out.print(count + " ");
        }
        System.out.println("");
    }
}
