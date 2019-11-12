package hw5;

import hw4.Human;

import java.util.Arrays;

public class FamilyApp {
    public static void main(String[] args) {
        Human myMother = new Human("Jane", "Karlenoe", 1955);
        Human myFather = new Human("Vito", "Karlenoe", 1953);
        Family myFamily = new Family(myMother,myFather);
        Family myFamily2 = new Family(myMother,myFather);
        Human child = new Human("Jhon","Karlenoe",1970);
        Human child2 = new Human("Jessi","Karlenoe",1980);
        myFamily.addChild(child);
        myFamily.addChild(child2);
        myFamily.deleteChild(3);
        for (int i =0; i<myFamily.children.length;i++){
            System.out.println(myFamily.children[i].getName());
        }
        System.out.println(myFamily.countFamily());
        if(myFamily.equals(myFamily2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("not equal");
        };
    }

}
