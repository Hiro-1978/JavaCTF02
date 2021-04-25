
package MobilePhone;

class Android extends MobilePhone{
        public Android(String name) {
        super(name);
        AndroidApp();
    }
        
    public void AndroidApp() {
        UseGearVR();
        TransformToPC();
        GooglePlay();
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
