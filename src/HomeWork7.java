
import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        String st1 = "You and Me";
        String st2 = " you and me ";
        // 7.1
        if (st1.equals(st2)) {
            System.out.println("ค่าเดียวกัน");
        } else {
            System.out.println("ไม่ใช่ค่าเดียวกัน");
        }
        System.out.println("################################");
        // 7.2
        System.out.println("มีคำว่า 'and' ใน st1 หรือไม่ : " + st1.contains("and"));
        System.out.println("มีคำว่า 'And' ใน st2 หรือไม่ : " + st2.contains("And"));
        System.out.println("################################");
        // 7.3
        System.out.println("ความยาวของ String ใน st1 มีค่าเท่ากับ : " + st1.length());
        System.out.println("ความยาวของ String ใน st2 มีค่าเท่ากับ : " + st2.length());
        System.out.println("################################");
        // 7.4
        System.out.println(st1.substring(1, 4));
        System.out.println(st2.substring(1, 4));
        System.out.println("################################");
        // 7.5
        System.out.println("st1 ก่อนตัดช่องว่าง " + st1 + " ความยาว String = " + st1.length());
        System.out.println("st1 หลังตัดช่องว่าง " + st1.trim() + " ความยาว String = " + (st1.trim()).length());
        System.out.println("st2 ก่อนตัดช่องว่าง " + st2 + " ความยาว String = " + st2.length());
        System.out.println("st2 หลังตัดช่องว่าง " + st2.trim() + " ความยาว String = " + (st2.trim()).length());
        System.out.println("################################");
        // 7.6
        System.out.println(st1.toUpperCase());
        System.out.println("################################");
        // 7.7
        System.out.println(setCapital(st2));
        System.out.println("################################");

    }

    static String setCapital(String msg) {
        return msg.trim().toUpperCase();
    }
}
