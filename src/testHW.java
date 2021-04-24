
import java.util.Scanner;

public class testHW {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
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
    }
}
