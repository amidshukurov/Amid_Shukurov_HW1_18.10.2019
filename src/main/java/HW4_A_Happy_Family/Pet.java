package HW4_A_Happy_Family;

public class Pet {
    String species;
    String name;
    int age;
    int trickLevel;
    String [] habits;

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond ( Pet petName) {
        System.out.format("Hello, owner. I am %s. I miss you.\n", petName.name);
    }

    public void foul() {
        System.out.println("I  need it cover it up.");
    }


    public static void main(String[] args) {
        Pet newPet = new Pet();
        newPet.name="Alabash";
        newPet.respond(newPet);
        newPet.foul();
    }

}

