package day10;

public class Employee {
    public   String firstname;
    public   String lastname;
    private  int salary;
    public String position;
    
    public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
        this.position = positionInput;
    }
    public void setSalary(int newSalary) {
        
    }
    public int getSalary() {
        return salary;
    }
    public void hello() {
        System.out.println("Hello "+this.firstname+" "+this.lastname);
    }
    
    public void checkPosition() {
        System.out.println("My Position is  "+position);
    }
}

