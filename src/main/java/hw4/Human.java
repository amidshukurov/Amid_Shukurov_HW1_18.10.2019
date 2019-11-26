package hw4;

import hw5.Family;

import java.util.Arrays;
import java.util.Objects;

public class Human extends Family{
   private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public Pet getPet() {
        return pet;
    }

    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public Human getMother() {
        return mother;
    }

    @Override
    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public Human getFather() {
        return father;
    }

    @Override
    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    private String surName;
   private int dateOfBirth;
   private int iq;
   private Pet pet;
   private Human mother;
   private Human father;
   private String[][] schedule;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth &&
                iq == human.iq &&
                name.equals(human.name) &&
                surName.equals(human.surName) &&
                pet.equals(human.pet) &&
                mother.equals(human.mother) &&
                father.equals(human.father) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surName, dateOfBirth, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        String humanInfo = "Human { name= " + name + ", surname= " + surName +", year= " + dateOfBirth + " " +
                ",iq= " + iq + ", mother = " + mother.name + " " + mother.surName+", father= " + father.name +
                " "+ father.surName;
        String petInfo =", pet=dog{nickName= " + pet.nickName+ ", age = " + pet.age + ", trickLavel = "
                + pet.trickLevel+ ", habits= " + Arrays.toString(pet.habits) + "}";
       if (pet!=null) {
           return humanInfo+petInfo;

       } else
           {
           return humanInfo;
       }
    }

    public String getName() {
        return name;
    }
}
