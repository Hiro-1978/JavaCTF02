
import java.util.Scanner;

public class HomeWork4_3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนคะแนนของคุณ : ");
        int score = kb.nextInt();
        if (score >= 80) {
            System.out.println("เกรด A");
        } else if (score >= 70 && score <= 79) {
            System.out.println("เกรด B");
        } else if (score >= 60 && score <= 69) {
            System.out.println("เกรด C");
        } else if (score >= 50 && score <= 59) {
            System.out.println("เกรด D");
        } else if (score >= 40 && score <= 49) {
            System.out.println("เกรด F");
        } else {
            System.out.println("เกรด E");
        }
    }
}
