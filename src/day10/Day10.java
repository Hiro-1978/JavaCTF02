package day10;

public class Day10 {

    public static void main(String[] args) {
        /*Employee dang = new Employee("Dang","Red", 10000);
        System.out.println(dang.getSalary()); // 10000
        dang.hello(); // Hello Dang
        CEO ceo = new CEO("Somchai","Sudlor", 30000);
        System.out.println(ceo.getSalary()); // 60000
        ceo.hello(); // Hi, nice to meet you. Somchai!
        ceo.fire(dang); // Dang has been fired!*/
        
        Programmer p1 = new Programmer("Paisan","Pompadech",45000);
        p1.hello();
        System.out.println(p1.getSalary());
        p1.createWebsite("Wordpress", "AmaZon");
        p1.installWindows("10", "15GJT-KIJTH-JFHYS-IRHHD-3LO8J");
        }
}

