package classroom._12_11_2019.warmup;

public class GenArray {
    int[] result;
    public int[] genArrByLenght(int lenght, int min, int max){
        result= new int[lenght];
        for (int i=0; i<lenght;i++) {
            result[i]=new RandomGen().getRandomNumberInRange(min,max);
        }
        return result;
    }
}
