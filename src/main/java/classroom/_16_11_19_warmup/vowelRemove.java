package classroom._16_11_19_warmup;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class vowelRemove {
    String filter (String origin){
        String result = "";
        for (int i = 0; i <origin.length() ; i++) {
            if (origin.toLowerCase().charAt(i)!='a'
                    & origin.toLowerCase().charAt(i)!='u'
                    & origin.toLowerCase().charAt(i)!='o'
                    & origin.toLowerCase().charAt(i)!='i'
                    & origin.toLowerCase().charAt(i)!='e'){
                result+=origin.charAt(i);
            }

        }
        return result;
    }

    String filterStream (String origin){
        String vowels = "AOUIE";
        String collect=  origin.chars()
        .mapToObj(c-> (char)c)
        .filter(c-> !vowels.contains(Character.toUpperCase(c)+""))
        .map(String::valueOf).collect(Collectors.joining());
    return collect;
    }

    String convert(String origin) {
      /*  String result ="";
        for (int i = 0; i <origin.length() ; i++) {
            if(origin.charAt(i)>96){
                result+=(char)(origin.charAt(i)-32) ;
            }
            else {
                result+=((char)(origin.charAt(i)+32));
            }
        }
        return result;*/
      String collect="";
        for (int i = 0; i <origin.length() ; i++) {
            collect+=(char)(origin.charAt(i)^32);
        }
        return collect;
    }

    public static void main(String[] args) {
        System.out.println(new vowelRemove().filter("Baku"));
        System.out.println(new vowelRemove().filterStream("Baku"));
        System.out.println(new vowelRemove().convert("BAakU"));
    }
}


