package classroom._02_11_2019.WarmUp;

public class CreateArray {

    public static int[] arrayCreated (int length){
        int [] array = new int[length];
        for (int i:array) {
            i=(int)(Math.random()*100);
        }
        return array;
    };
}
