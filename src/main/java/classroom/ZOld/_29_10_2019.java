package classroom.ZOld;


import java.util.Scanner;

public class _29_10_2019 {
    public static boolean isNumeric(String origin) {
        try {
            Integer.parseInt(origin);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public static int convert(String parts){
        return Integer.parseInt(parts);
    }

    public static StringBuilder function (String[] parts){
        StringBuilder resultString = new StringBuilder();
        StringBuilder holder = new StringBuilder();
        int sum = 0, count=0;
        for (int i = 0; i < parts.length; i++) {
            if (isNumeric(parts[i])) {
                sum += convert(parts[i]);
            } else {
                count++;
                holder.append(parts[i]);
                holder.append(" ");
            }
        };
        resultString.append(sum);
        resultString.append(": ");
        resultString.append(count);
        resultString.append(" Wrong are: < ");
        resultString.append(holder);
        resultString.append(" >");
        return resultString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] parts = string.split(" ");

        System.out.println(function(parts));
    }
}
