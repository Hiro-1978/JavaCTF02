
public class labMethod {

    public static void main(String[] args) {

        System.out.println("Hello " + hellWorld());
        display();

    }

    // การสร้างเมธอด
    static String hellWorld() {
        // เมธอดแบบ Return ค่า
        String str = "Return Method";
        return str;
    }

    static void display() {
        // เมธอดแบบไม่ Return ค่า
        System.out.println("Hello Not Return Method");
    }

}
