package classroom._02_11_2019.WarmUp;



import java.util.Arrays;

public class Main {
    public static int[] arrayCreated(int length){
        int [] array = new int[length];
        for (int i =0; i<length;i++){
            array[i]=(int)(Math.random()*100);
        }
        return array;
    };
    public static void main(String[] args) {
        int[] array = arrayCreated(30);
        int[] arrayPairs = new int[array.length-1];
        for (int i =0; i<arrayPairs.length;i++){
            arrayPairs[i] =array[i]+array[i+1];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayPairs));
       Arrays.sort(arrayPairs);
       System.out.println(Arrays.toString(arrayPairs));

        for (int i =0; i<arrayPairs.length;i++){
            int count = 0;
            if(arrayPairs[0]==array[i]+array[i+1]){
                System.out.printf("The index of that minimal pair First: %d, Second: %d\n",i,i+1);
                System.out.printf("Left number: %d\n",array[i]);
                System.out.printf("Right number: %d\n",array[i+1]);
                System.out.printf("Sum of minimal pair: %d\n",arrayPairs[count]);
                count++;
            };
        }



    }
}
