package classroom._12_11_2019.sortarray;

import classroom._12_11_2019.warmup.GenArray;
import classroom._12_11_2019.warmup.SortArray;

public class MergeSort {
    public static void main(String[] args) {
        int lenght =10;
        int[] origin = new GenArray().genArrByLenght(lenght,0,100);
        int[] origin2 = new GenArray().genArrByLenght(lenght,0,100);
        int[] sortedArray1 = new SortArray().asc(origin);
        int[] sortedArray2 = new SortArray().asc(origin2);
        int [] mergedArray=new int[sortedArray1.length+sortedArray2.length];
    }


}
