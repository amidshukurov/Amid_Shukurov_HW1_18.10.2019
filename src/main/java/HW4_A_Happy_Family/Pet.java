package HW4_A_Happy_Family;

import java.util.Arrays;

public class Pet {
    String species;
    String nickName;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.format("Hello, owner. I am %s. I miss you.", nickName);
        System.out.println();
    }

    public void foul() {
        System.out.println("I  need it cover it up.");
    }

    @Override
    public String toString() {
        if (species.toLowerCase().equals("dog")) {

            return String.format("dog{nickName= " + nickName + ", age = " + age + ", trickLavel = "
                    + trickLevel + ", habits= " + Arrays.toString(habits)+"}");
        } else  return " ";
    }

}

