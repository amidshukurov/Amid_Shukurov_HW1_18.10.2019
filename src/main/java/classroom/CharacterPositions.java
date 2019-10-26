package classroom;

import java.util.*;

public class CharacterPositions {

  public Map<Character, List<Integer>> process(String origin_) {
    String origin = origin_.toLowerCase();
    // unique
    Set<Character> unique = new HashSet<Character>();
    for (int index = 0; index < origin.length(); index++) {
      char c = origin.charAt(index);
      unique.add(c);
    }
    // map initialization with <char, empty list>
    Map<Character, List<Integer>> positions = new HashMap<>();
    for (Character c: unique) {
      positions.put(c, new ArrayList<>());
    }

    for (int index = 0; index < origin.length(); index++) {
      char c = origin.charAt(index);
      positions.get(c).add(index + 1);
    }
    return positions;
  }
  public Map<StringBuilder, List<Integer>> position (Map<Character, List<Integer>> result){
    Map<StringBuilder, List<Integer>> positions = new HashMap<>();
    StringBuilder s = new StringBuilder();
    Set<Character> keys = result.keySet();
    for (int i = 0; i < result.size(); i++) {
      s.append(keys.toArray()[i]);
      s.append(" = ");
      s.append(result.get(keys.toArray()[i]).size());
      s.append(result.get(keys.toArray()[i]));
      positions.put(s,result.get(keys.toArray()[i]));
    }
    return positions;
  }
  public void printOut (Map<Character, List<Integer>> result){
    Set<Character> keys = result.keySet();
    for (int i = 0; i < result.size(); i++) {
      System.out.printf("Letters: %s : %d : %s \n",
              keys.toArray()[i],
              result.get(keys.toArray()[i]).size(),
              result.get(keys.toArray()[i])
              );
    }
  }

  public static void main(String[] args) {
    SplitString s  =   new SplitString();
    // 1. data obtaining
    final String origin =  s.gen_random(80);
    // 2. data process
    CharacterPositions app = new CharacterPositions();
    Map<Character, List<Integer>> result = app.process(origin);


    // 3. output the result
    System.out.println(origin);
    System.out.println(result);
    System.out.println(result.size());
    app.printOut(result);
  }
}
