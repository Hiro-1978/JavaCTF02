package Abstract;

class Programmer extends Employee { 
    public Programmer(String name,Double salary){
         super(name,salary);
         System.out.println("I'm Programmer");     
    }

    public void skill() {
        System.out.println("I have no Skill");
    }

    public void skill(String... language) { 
        for (int i = 0; i < language.length; i++) {
            System.out.println("Skill = " + language[i]);
        }
    }

    public void bonus(){
        System.out.println("โบนัส = 20%");
    }
}
