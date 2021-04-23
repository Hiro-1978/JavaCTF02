
public class HomeWork3 {

    public static void main(String[] args) {
        // 3.1
        int i1 = 20;
        for (int count = 0; count <= 5; count++) {
            i1++;
        }
        System.out.println(i1);

        // 3.2
        int i2 = 20;
        for (int count = 0; count <= 5; count++) {
            --i2;
        }
        System.out.println(i2);

        // 3.3
        float n1 = 1.25f;
        float n2 = 2.25f;
        
        char c1 = 'A';
        char c2 = 'Z';
        
        if ((n1 == 1.25) && (n2 == 2.25)) {
            System.out.println("N1 is 1.25 AND N2 is 2.25");
        }
        if ((c1 == 'A') || (c2 == 'A')) {
            System.out.println("C1 is A OR C2 is A");
        }
    }
}
