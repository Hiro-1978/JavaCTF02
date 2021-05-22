package Abstract;

  final abstract class Employee {

    private String id;
    private String name;
    final private Double salary = 15000.0;

    public Employee() {
        // Constuctor
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void displayEmployee() {
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

    final abstract public void bonus();

    public void setID(String id) {
        this.id = id; 
    }

    public void setName(String name) { 
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }
}
