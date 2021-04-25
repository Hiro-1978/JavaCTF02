package MobilePhone;

public class main {

    public static void main(String[] args) {
        IPhone ipx = new IPhone("IPhoneX");
        ipx.FaceID();
        
        IPhone ip8 = new IPhone("IPhone8");
        ip8.TouchID();
                        
        Android s8 = new Android("Samsung Galaxy S8");
        
        Android n8 = new Android("Samsung Galaxy Note 8");
        n8.UsePen();
    }
}
