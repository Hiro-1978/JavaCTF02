
package Casting;
//import java.util.ArrayList;

public class Day10 { 
public static void main(String[] args) {
/*Employee dang = new Employee("Dang", "Red", 10000);
Employee ceo = new CEO("Captain", "Marvel", 30000);
Programmer prog = new Programmer("Captain", "Marvel", 20000);
CEO ceo2 = (CEO) ceo;
// CEO ceo3 = new Employee("Captain", "Marvel", 30000); // Error
// CEO ceo4 = (CEO) dang; // Error
ArrayList<Employee> myList = new ArrayList<>();
myList.add(ceo2);
myList.add(dang);
myList.add(prog);
CEO ceo3 = (CEO) myList.get(0);
Employee dang2 = myList.get(1);
Programmer prog2 = (Programmer) myList.get(2);
ceo3.hello(); // Hi, nice to meet you. Captain!
prog2.hello(); // Hello Captain*/

CEO ceo = new CEO("Captain", "Marvel", 30000);
IWebsiteCreator dang = new Programmer("Dang", "Red", 10000);
Programmer dang2 = (Programmer) dang;
AI alphaGo = new AI("alphaGo", "Java");
IWebsiteCreator alphaGo2 = alphaGo;
ceo.orderWebsite(dang);
ceo.orderWebsite(dang2);
ceo.orderWebsite(alphaGo);
ceo.orderWebsite(alphaGo2);
    }
}