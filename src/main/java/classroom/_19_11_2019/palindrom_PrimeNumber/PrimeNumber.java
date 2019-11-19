package classroom._19_11_2019.palindrom_PrimeNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PrimeNumber {
    boolean check(int origin){
        int i,m=0,flag=0;
        m=origin/2;
        if(origin==0||origin==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(origin%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    int[] randomPrimeN(int lenght){
        int[] result = new int[lenght];
        for (int i = 0; i <lenght;) {
            if (check(i)){
                result[i++]=i;
            }
        }
        return result;
    }

    Set<Integer> randomPrimeNSet(int lenght){
        Random random = new Random();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i <lenght;) {
            int temp = random.nextInt();
            if (check(temp)){
                result.add(temp);
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new PrimeNumber().check(14));
        System.out.println(Arrays.toString(new PrimeNumber().randomPrimeN(10000)));

    }

}
