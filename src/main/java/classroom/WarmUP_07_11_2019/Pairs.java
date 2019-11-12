package classroom.WarmUP_07_11_2019;

public class Pairs implements PairOfShoes {
/*

  @Override
  public int pairs(String origin) {
    origin=origin.toUpperCase();
    int result = 0;
    int nmR=0,nmL=0;
    for (int i=0; i<origin.length(); i++) {
      char c = origin.charAt(i);
      int j=0;
      while (j!=origin.length()-1){
      switch (c) {
        case 'R':
          nmR++;
          break;
        case 'L':
          nmL++;
          break;
        default:
          throw new IllegalArgumentException("Wrong char");
      }
      if(nmR==nmL) result++;
      j++;
      }
    }
    return result;
  }
*/

  @Override
  public int pairs(String origin) {
    origin=origin.toUpperCase();
    int result = 0;
    int nmPairs=0;
    for (int i=0; i<origin.length(); i++) {
      char c = origin.charAt(i);
      int j=0;
        switch (c) {
          case 'R':
            nmPairs++;
            break;
          case 'L':
            nmPairs--;
            break;
          default:
            throw new IllegalArgumentException("Wrong char");
        }
        if(nmPairs==0) result++;
      }
    return result;
  }
  public static void main(String[] args) {
    Pairs n = new Pairs();
    String origin = "LLRRLRLRRRR";
    System.out.println(n.pairs(origin));
  }
}
