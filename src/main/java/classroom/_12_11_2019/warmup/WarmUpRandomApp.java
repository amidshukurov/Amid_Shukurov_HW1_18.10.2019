package classroom._12_11_2019.warmup;

import java.util.Arrays;

public class WarmUpRandomApp {
    public static void main(String[] args) {
        int lenght =25;
        int[] originArray = new GenArray().genArrByLenght(lenght,10,100);
        int[] sortedArray = new SortArray().asc(originArray);
        System.out.println(Arrays.toString(originArray));
        System.out.println(Arrays.toString(sortedArray));
    }

}
