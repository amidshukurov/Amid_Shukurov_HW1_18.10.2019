package HW4_A_Happy_Family;

public class Main {

    public static void main(String[] args) {
        Pet newPet = new Pet("Dog","Rock", 5, 75,new String[]{"eat","drink","sleep"});
        Human mother = new Human("Jane","Karlenoe",1955);
        Human father = new Human("Vito","Karlenoe",1953);
        Human child = new Human("Jane","Karlenoe",1977,mother,father);
        child.iq=90;
        child.pet = newPet;
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
