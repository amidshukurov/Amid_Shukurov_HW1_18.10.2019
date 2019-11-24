package classroom._21_11_2019.vertex;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class GraphPath {
  private final XGraph g;

  public GraphPath(XGraph g) {
    this.g = g;
  }

  List<Integer> path(int from, int to) {
    ArrayList<Integer> path = new ArrayList<>();
    List<Integer> range = g.get(from);
    path.add(from);
    for (int i = 0; i < range.size(); i++) {
      if (range.get(i) == to) {
        path.add(range.get(i));
        return path;
      }
    }
    for (int i = 0; i < range.size(); i++) {
      for (int j = 0; j < range.size(); j++) {
        path.add(range.get(i));
        range = g.get(range.get(i));
        for (int k = 0; k < range.size(); k++) {
          if (range.get(k) == to) {
            path.add(range.get(k));
            return path;
          }
        }
      }
    }
    return null;
  }


  boolean partCheck(int from, int to) {
    if(g==null) return false;
    List<Integer> range = g.get(from);
      for (int i = 0; i < range.size(); i++) {
        if (range.get(i) == to)
        {
          System.out.println(range.get(i));
          return true;
        }
      }
    for (int i = 0; i < range.size(); i++) {
      for (int j = 0; j < range.size(); j++) {
        System.out.println(range.get(i));
        range = g.get(range.get(i));
        for (int k = 0; k < range.size(); k++) {
          if (range.get(k) == to) {
            System.out.println(range.get(k));
            return true;
          }
        }
      }
    }
    return false;
  }
}
