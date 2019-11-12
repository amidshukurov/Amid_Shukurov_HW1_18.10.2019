package classroom._12_11_2019.warmup;

public class SortArray {

    public int[] asc(int[] origin){
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

}
