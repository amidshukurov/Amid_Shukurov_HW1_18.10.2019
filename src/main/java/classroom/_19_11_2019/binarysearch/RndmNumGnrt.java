package classroom._19_11_2019.binarysearch;

import classroom._12_11_2019.warmup.GenArray;
import classroom._14_11_19_LinkedLIst.LinkedList;
import classroom._16_11_19_warmup.ArraySort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RndmNumGnrt {
    public static void main(String[] args) {


        long before = System.currentTimeMillis();
        int[] array = new GenArray().genArrByLenght(10000, 0, 1000);

        Arrays.sort(array);

        List<Integer> contains = new ArrayList<>();

        int[] ar2 = new GenArray().genArrByLenght(1000, 0, 100);
        int count = 0;
        for (int i = 0; i < ar2.length; i++) {
            count++;
            for (int j = 0; j < array.length; j++) {
                if (ar2[i] == array[j]) {
                    contains.add(ar2[i]);
                    count++;
                    break;
                }
            }
        }

        long after = System.currentTimeMillis();
        System.out.println(after - before);
        System.out.println(count);
    }

}
