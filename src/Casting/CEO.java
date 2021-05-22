package Casting;
public class CEO extends Employee {   
    public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }
    @Override
    public int getSalary() {
        return super.getSalary() * 2;
    }
    
    @Override
    public void hello() {
        System.out.println("Hi, nice to meet you. "+this.firstname+"!");
    }

    void orderWebsite(IWebsiteCreator dang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
