package MobilePhone;

public class MobilePhone {

    public String name;

    public MobilePhone(String name) {
        this.name = name;
        System.out.println("#######################");
        System.out.println("Smart Phone รุ่น = " + name);
        System.out.println("##Feature##");
        Feature();
    }

    public void Feature() {
        PhoneCall();
        SMS();
        InternetSurfing();
    }

    public void PhoneCall() {
        System.out.println("PhoneCall()");
    }

    public void SMS() {
        System.out.println("SMS()");
    }

    public void InternetSurfing() {
        System.out.println("InternetSurfing()");
    }
}
