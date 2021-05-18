package Employee;


import java.util.Scanner;

public class HomeWork10 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("name" + i, "lastname" + i, i * 10000);
        }
        System.out.println(employees[1].firstname); 
        System.out.println(employees[1].lastname);
        System.out.println(employees[1].getSalary()); 
        System.out.println(employees[2].firstname);
        System.out.println(employees[2].lastname);
        System.out.println(employees[2].getSalary());
    }
}
