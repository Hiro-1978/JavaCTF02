package day10;

public class Programmer extends Employee {   
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
        super(firstnameInput, lastnameInput, salaryInput, positionInput);
    }
    public void fixPC(String serialNumber) {
        System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
    }
    // สร้าง Method createWebsite()
    public void createWebsite(String template, String titleName){
        System.out.println("I'm Create Website by "+template+" This Website name "+ titleName);
    }
    // สร้าง Method installWindows()
    public void installWindows(String version, String productKey){
        System.out.println("I'm Install Windows Vession "+version+" By Product Key : "+ productKey);
    }
}
   