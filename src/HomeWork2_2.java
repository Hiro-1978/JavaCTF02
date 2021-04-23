
public class HomeWork2_2 {

    public static void main(String[] args){
        bark();
        
        float a = 10.2f;
        int b = 15;
        double c = 1.2345;
        char d = '5';
        
       /* 
        final String hello = "Hello";
                        hello = "World"; // Error ไม่สามารถรันได้
        */
       
        System.out.println("This is change Float to Int = "+(int)a);
        System.out.println("This is change Int to Float = "+(float)b);
        System.out.println("This is change Double to Float = "+(double)c);
        System.out.println("This is change Char to Int = "+(int)d);

     }
    
    static void bark(){
            String dogName = "Lobo";
            System.out.println("The Dog Name = "+dogName+" bark");
       }
    
}
