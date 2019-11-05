/*
package classroom._31_10_2019;


import java.util.Arrays;

public class WarmUp_31_10 {

    public static void main(String[] args) {
        String origin = "5 + 2/4";
        String[] split = origin.split("\\+");
        double result   =0;

        for (int i=0; i<split.length;i++) {
            String[] parts = split[i].split("/");
            System.out.println(Arrays.toString(parts));
            System.out.println(Integer.parseInt(parts[0].replaceAll(" ","")));
            System.out.println(Integer.parseInt(parts[1].replaceAll(" ","")));
            if(origin.contains("+")){
                result += Double.parseDouble(parts[0].replaceAll(" ",""))/
                        Double.parseDouble(parts[1].replaceAll(" ",""));
            }

        }
        System.out.println(result);
    }
}
*/
