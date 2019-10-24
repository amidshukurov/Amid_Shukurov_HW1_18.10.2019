package classroom;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>(){{
            add("Java");
            add("Scala");
            add("C++");
            add("Hasekll");
        }};
        //step1
        for (String s:languages){
            System.out.println(s);
        }
        System.out.println();
        //Step2
        Consumer<String> my_consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        languages.forEach(my_consumer);
        System.out.println();
        //step3  anonymous class
        languages.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();
        //Step4
        languages.forEach((String s) -> {
            System.out.println(s);
        });
        System.out.println();
        //Step5
        languages.forEach(s-> System.out.println(s));
        System.out.println();
        //Step6
        languages.forEach(System.out::println);
    }
}
