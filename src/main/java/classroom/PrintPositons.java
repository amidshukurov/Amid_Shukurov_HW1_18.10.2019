package classroom;

import java.util.ArrayList;

public class PrintPositons {
    public static void main(String[] args) {
        SplitString s  =   new SplitString();
       String gen_random = s.gen_random(10).toLowerCase();
        System.out.println(gen_random);
        StringBuilder listOfChars = new StringBuilder();
        StringBuilder listOfPosition = new StringBuilder();
        for (int i=0;i<gen_random.length();i++){
            int count =0;
            for (int j=0; j<gen_random.length();j++){
                if (gen_random.charAt(i)==gen_random.charAt(j)) {
                    if (i > j) {
                        break;
                    } else {
                        count++;
                        listOfPosition.append(j + 1);
                        listOfPosition.append(' ');
                    }
                }
            }
            if (count!=0) {
                listOfChars.append(gen_random.charAt(i));
                listOfChars.append(':');
                listOfChars.append(count);
                listOfChars.append(" < ");
                listOfChars.append(listOfPosition);
                listOfChars.append("> ");
                listOfPosition.replace(0,listOfPosition.length()-1,"");
            }
        }

        System.out.println(listOfChars);

    }

}
