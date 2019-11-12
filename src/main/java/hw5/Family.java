package hw5;

import hw4.Human;
import hw4.Pet;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Family() {
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
        Human[] nextChild = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            nextChild[i] = children[i];
        }
        nextChild[children.length] = child;
        setChildren(nextChild);
    }

    /*delete a child -  deleteChild
    (accepts and array index and deltes the following element;
    returns a boolean value - was the element deleted or not)
    */
    boolean deleteChild(int index) {
        if (children.length >= index && index > 0) {
            Human[] resultOfDeleteChild = new Human[children.length - 1];
            System.out.println(children.length);
            int count = 0;
            for (int i = 0; i < children.length; i++) {
                if (i == index - 1) continue;
                resultOfDeleteChild[count++] = children[i];
            }
            setChildren(resultOfDeleteChild);
            return true;
        } else {
            System.out.println("False");
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
        String result = "Override of family to string";
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }

		/* Check if o is an instance of Complex or not
		"null instanceof [type]" also returns false */
        if (!(obj instanceof Family)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Family c = (Family) obj;

        // Compare the data members and return accordingly
        return mother.getName().compareTo(c.mother.getName()) == 0
                && father.getName().compareTo(c.father.getName()) == 0;
    }
}
