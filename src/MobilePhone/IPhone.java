package MobilePhone;

class IPhone extends MobilePhone {

    public IPhone(String name) {
        super(name);
        AppStore();
    }
    
    public void AppStore() {
        System.out.println("AppStore()");
    }
    
    public void FaceID() {
        System.out.println("FaceID()");
    }

    public void TouchID() {
        System.out.println("TouchID()");
    }
}
