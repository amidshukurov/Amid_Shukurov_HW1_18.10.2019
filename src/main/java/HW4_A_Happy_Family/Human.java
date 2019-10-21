package HW4_A_Happy_Family;

public class Human {
    String name;
    String surName;
    int dateOfBirth;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;
    public void greetPet( Pet petName){
        System.out.format("Hello, %s", petName.name);
    }
    public void describePet( Pet petName){
        String i="very sly";
        String j="almost not sly";
        String t =(petName.trickLevel>50) ? i:j;
        System.out.format("I have a %s, he is %d" +
                "years old, he is %s", petName.species,petName.age,t);
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.name="Amid";
        Pet newPet = new Pet();
        newPet.name="Alabash";
        newPet.species="Haski";
        newPet.age=6;
        newPet.trickLevel=50;
        human.greetPet(newPet);
        System.out.println("\n\n\n");
        human.describePet(newPet);
    }
}
