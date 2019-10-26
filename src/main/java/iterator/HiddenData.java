package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HiddenData implements Iterable<String> {
  private final List<String> months = Arrays.asList(
      "Jan","Feb","Mar","Apr","May");

  @Override
  public Iterator<String> iterator() {

    Iterator<String> iterator = new Iterator<String>() {
      Random random = new Random();
      int[] indexes = new int[months.size()-1];

      int index=0;

      @Override
      public boolean hasNext() {
        return index < months.size();
      }

      @Override
      public String next() {
        int rm = random.nextInt(months.size()-1);
        indexes[index]=rm;
        index++;
        for (int i = 0; i <= index; i++) {
          if (rm!=indexes[i]){
            return months.get(rm);
          } else  continue;
        }
      }
    };

    return iterator;
  }
}
