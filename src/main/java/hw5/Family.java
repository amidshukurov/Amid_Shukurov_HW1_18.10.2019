package hw5;

import hw4.Human;
import hw4.Pet;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Objects;

public class Family {
   private Human mother;
   private Human father;
   private Human[] children;
   private Pet pet;

    public Family() {

    }

    static {
        System.out.println("Family class is loaded.");
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[0];
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        child.setMother(mother);
        child.setFather(father);
        Human[] nextChild = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            nextChild[i] = children[i];
        }
        nextChild[children.length] = child;
        children=nextChild;
    }

    void deleteChild(Human child) {
        Human[] remainedChilderen = new Human[children.length - 1];
        int j=0;
            for (int i = 0; i <children.length ; i++) {
                if (!child.equals(children[i]) && child.hashCode()==children[i].hashCode()){
                    remainedChilderen[j++]=children[i];
                }
            }
            children=remainedChilderen;

    }

    boolean deleteChild(int index) {
        Human[] resultOfDeleteChild = new Human[children.length - 1];
        if (children.length >= index && index > 0) {
            int count = 0;
            for (int i = 0; i < children.length; i++) {
                if (i == index - 1) continue;
                resultOfDeleteChild[count++] = children[i];
            }
            children =resultOfDeleteChild;
            return true;
        } else {
            System.out.println("Wrong index entered. Might be less than 0 or greater than number of children");
            return false;
        }
    }


    int countFamily() {
        int count = 0;
        if (mother != null) count++;
        if (father != null) count++;
        return count + children.length;
    }

    @Override
    public String toString() {
        String childNames = "";
        for (int i = 0; i <children.length ; i++) {
            childNames= childNames + "\n"+ children[i].getName();
        }
        return "Father = "+father.getName()+"\nMother= "+mother.getName()+"\nChilderen: "+childNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                Arrays.equals(children, family.children) &&
                pet.equals(family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
