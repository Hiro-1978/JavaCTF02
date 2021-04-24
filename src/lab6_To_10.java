
import java.util.Scanner;


public class lab6_To_10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            // Lab 6.1
            System.out.println("รอบที่ " + i + " = " + (i++));
            sum += i;
        }
        System.out.println("################");

        // Lab 6.2        
        System.out.println("ผลรวมตั้งแต่ 1-10 = " + sum);
        System.out.println("################");

        // Lab 6.3        
        int n = 1;
        System.out.print("ตัวเลขที่หารต้วย 12 ลงตัว ตั้งแต่ 1-100 = ");
        while (n <= 100) {
            if (n % 12 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println("");
        System.out.println("################");

        // Lab 6.4
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("สมาชิก Array = ");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("################");
        // Lab 7.1
        int number = 20;
        System.out.print("แสดงค่าตัวเลขตั้งแต่ 1-20 จากมากไปหาน้อย = ");
        do {
            System.out.print(number + " ");
            --number;
        } while (number >= 1);
        System.out.println("");
        System.out.println("################");
        
        // Lab 7.2
        Scanner kb = new Scanner(System.in);
        //int n;
        do {
            System.out.print("Please Input Number : ");
            n = kb.nextInt();
            if (n % 2 == 0) {
                System.out.println(+n + " เป็นจำนวนคู่");
            } else {
                System.out.println(+n + " เป็นจำนวนคี่");
            }
        } while (n % 2 == 0);
        System.out.println("จบการทำงานของโปรแกรม");
                System.out.println("");
        System.out.println("################");
        
        // Lab 8
    }
}
