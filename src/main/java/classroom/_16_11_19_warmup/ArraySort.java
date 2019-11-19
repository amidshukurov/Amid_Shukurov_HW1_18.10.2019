package classroom._16_11_19_warmup;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    int[] randomArray( int lenght){
        Random random = new Random();
        int [] origin = new int[lenght];
        for (int i = 0; i <origin.length ; i++) {
            origin[i]=random.nextInt(100);
        }
        return origin;
    }

    public int[] ascSort(int[] origin){
        int [] sorted = origin.clone();
        for (int i=1;i<sorted.length;i++){
            for (int j=0;j<i;j++){
                if (sorted[i]<sorted[j]){
                    int temp=sorted[j];
                    sorted[j]=sorted[i];
                    sorted[i]=temp;
                }
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        int [] origin = arraySort.randomArray(10);
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(arraySort.ascSort(origin)));
    }
}
