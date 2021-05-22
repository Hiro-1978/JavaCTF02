package day10;

public class Day10 {

    public static void main(String[] args) {
               
        Programmer p1 = new Programmer("Paisan","Pompadech",45000);
        p1.hello();
        System.out.println(p1.getSalary());
        p1.createWebsite("Wordpress", "AmaZon");
        p1.installWindows("10", "15GJT-KIJTH-JFHYS-IRHHD-3LO8J");
        
        // Check Position
        Employee H1 = new Employee("Hiro","Kunimi", 100000);
        H1.hello();
        H1.checkPosition();
        }
}

