package MobilePhone;

public class MobilePhone {

    public String name;

    public MobilePhone(String name) {
        this.name = name;
        System.out.println("#######################");
        System.out.println("Smart Phone รุ่น = " + name);
        System.out.println("##Feature หลัก##");
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

    public void AppStore() {
        System.out.println("AppStore()");
    }

    public void AndroidApp() {
        System.out.println("UseGearVR()");
        System.out.println("TransformToPC()");
        System.out.println("GooglePlay()");
    }

    public void FaceID() {
        System.out.println("FaceID()");
    }

    public void TouchID() {
        System.out.println("TouchID()");
    }

    public void UseGearVR() {
        System.out.println("UseGearVR()");
    }

    public void TransformToPC() {
        System.out.println("TransformToPC()");
    }

    public void GooglePlay() {
        System.out.println("GooglePlay()");
    }

    public void UsePen() {
        System.out.println("UsePen()");
    }
}
