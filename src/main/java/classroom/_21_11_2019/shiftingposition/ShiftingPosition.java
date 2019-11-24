package classroom._21_11_2019.shiftingposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShiftingPosition {
    List randomList(int lenght, int left, int right) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < lenght ; i++) {
            result.add(random.nextInt(right-left)+left);
        }
        return result;
    }
    List shifNeg(List<Integer> origin){
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i <origin.size() ; i++) {
            if (origin.get(i)<0){
                negatives.add(origin.get(i));
            }
        }
        int temp=negatives.get(negatives.size()-1);
        for (int i = negatives.size()-2; i >=0 ; i--) {
            negatives.set(i+1,negatives.get(i));
        }
        negatives.set(0,temp);

        for (int i = 0,j=0; i <origin.size() ; i++) {
            if (origin.get(i)<0){
                origin.set(i,negatives.get(j++));
            }
        }
        return origin;
    }

    List shifPos(List<Integer> origin){
        List<Integer> positives = new ArrayList<>();
        for (int i = 0; i <origin.size() ; i++) {
            if (origin.get(i)>=0){
                positives.add(origin.get(i));
            }
        }
        int temp=positives.get(positives.size()-1);
        for (int i = positives.size()-2; i >=0 ; i--) {
            positives.set(i+1,positives.get(i));
        }
        positives.set(0,temp);

        for (int i = 0,j=0; i <origin.size() ; i++) {
            if (origin.get(i)>=0){
                origin.set(i,positives.get(j++));
            }
        }
        return origin;
    }
    List shiftAll(List<Integer> origin){
        return shifPos(shifNeg(origin));
    }
    public static void main(String[] args) {
        ShiftingPosition shiftP = new ShiftingPosition();
        List<Integer> origin=shiftP.randomList(10,-10,10);
        System.out.println(origin);
        System.out.println(shiftP.shifNeg(origin));
        System.out.println(shiftP.shifPos(shiftP.shifNeg(origin)));
        System.out.println(shiftP.shiftAll(origin));
        System.out.println(origin);

    }
}
