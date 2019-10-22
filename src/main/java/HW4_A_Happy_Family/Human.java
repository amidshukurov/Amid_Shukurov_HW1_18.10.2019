package HW4_A_Happy_Family;

import java.util.Arrays;

public class Human {
    String name;
    String surName;
    int dateOfBirth;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {
    }

    public Human(String name, String surName, int dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surName, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet(){
        System.out.format("Hello, %s",pet.nickName);
        System.out.println();
    }
    public void describePet(){
        String i="very sly";
        String j="almost not sly";
        String t =(pet.trickLevel>50) ? i:j;
        System.out.format("I have a %s, he is %d years old, he is %s", pet.species,pet.age,t);
        System.out.println();
    }

    @Override
    public String toString() {
        String humanInfo = new String();
        humanInfo="Human { name= " + name + ", surname= " + surName +", year= " + dateOfBirth + " " +
                ",iq= " + iq + ", mother = " + mother.name + " " + mother.surName+", father= " + father.name +
                " "+ father.surName;
        String petinfo = new String();
        petinfo=", pet=dog{nickName= " + pet.nickName+ ", age = " + pet.age + ", trickLavel = "
                + pet.trickLevel+ ", habits= " + Arrays.toString(pet.habits) + "}";
       if (pet.species.toLowerCase().equals("dog")) {
           return humanInfo+petinfo;

       } else
           {
           return humanInfo;
       }
    }
}
