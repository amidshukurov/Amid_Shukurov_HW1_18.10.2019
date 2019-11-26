package hw4;

public class HappyFamily {

    public static void main(String[] args) {
        Pet newPet = new Pet("Dog","Rock", 5, 75,new String[]{"eat","drink","sleep"});
        Human mother = new Human("Fatima","Agaeva",1955);
        Human father = new Human("Huseyn","Agaeva",1953);
        Human child = new Human("Dunya","Agaeva",1977,mother,father);
        child.setIq(90);
        child.setPet(newPet);
        //Pet methods call
        newPet.respond();
        newPet.eat();
        newPet.foul();
        // Human method calls
        child.greetPet();
        child.describePet();
        System.out.println(newPet);
        System.out.println(child);
    }

}
