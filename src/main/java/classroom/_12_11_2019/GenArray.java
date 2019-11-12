package classroom._12_11_2019;

public class GenArray {
    int[] result;
    int[] genArrByLenght(int lenght){
        result= new int[lenght];
        for (int i=0; i<lenght;i++) {
            result[i]=new RandomGen().getRandomNumberInRange(10,50);
        }
        return result;
    }
}
