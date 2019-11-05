/*package classroom._31_10_2019;

import java.util.Arrays;

public class Split {

    public String[] splitBySign (String origin){
        String[] split = origin.split("\\+");
        return split;
    };

    public String[] partsOfOrigin (String[] split) {
        for (int i = 0; i < split.length; i++) {
            String[] parts = split[i].split("/");
            System.out.println(Arrays.toString(parts));
            System.out.println(Integer.parseInt(parts[0].replaceAll(" ", "")));
            System.out.println(Integer.parseInt(parts[1].replaceAll(" ", "")));
            if (origin.contains("+")) {
                result += Double.parseDouble(parts[0].replaceAll(" ", "")) /
                        Double.parseDouble(parts[1].replaceAll(" ", ""));
            }
        }

    }
}*/
