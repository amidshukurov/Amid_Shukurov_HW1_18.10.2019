package classroom._23_11_2019;

import java.util.*;

public class Common {

  public static <T> List<T> list(T... strings) {
    return Arrays.asList(strings);
  }

  public static List<String> createSentences(List<String> subject,List<String> verb,List<String> object){
    List<String> result = new ArrayList<>();
    for (int i = 0; i <subject.size() ; i++) {
      String combination = "";
      for (int j = 0; j <verb.size() ; j++) {
        for (int k = 0; k <object.size() ; k++) {
          combination = subject.get(i)+" "+ verb.get(j)+ " "+ object.get(k);
          result.add(combination);
        }
      }

    }
    return result;
  }
  public static void printSentences(List<String> origin){
    for (int i = 0; i < origin.size(); i++) {
      System.out.println(origin.get(i));
    }
  }
  public static <K> Map<K, List<K>> map(Entry<K, List<K>>... items) {
    HashMap<K, List<K>> m = new HashMap<>();
    for (Entry<K, List<K>> item: items) {
      m.put(item.getKey(), item.getVal());
    }
    return m;
  }

  public static <T> Entry<T, List<T>> of(T key, List<T> value) {
    return new Entry<>(key, value);
  }

  public static <T> String combine(T... words) {
    StringJoiner sj = new StringJoiner(" ");
    for (T word: words) sj.add(word.toString());
    return sj.toString();
  }
}
