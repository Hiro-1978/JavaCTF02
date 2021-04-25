
public class HomeWork4_1 {

    public static void main(String[] args) {
        // รวมข้อ 4.1-4.2
        int score = 20;
        boolean IsHandSome = true;

        if (score >= 80) {
            if (score >= 80) {
                System.out.println("Good");
            } else if (IsHandSome == true) {
                System.out.println("Good");
            }
        } else if (score >= 50 && score < 80) {
            if (score >= 50 && score < 80) {
                System.out.println("normal");
            } else if (IsHandSome == true) {
                System.out.println("Good");
            }
        } else if (IsHandSome == true) {
            System.out.println("Good");
        } else {
            System.out.println("fail");
        }
    }
}
