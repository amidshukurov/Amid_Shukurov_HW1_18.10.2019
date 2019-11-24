package classroom._21_11_2019.binarytree;

public class XTreeApp {
  public static void main(String[] args) {
    XTree x = new XTree();
    x.add(20);
    x.add(10);
    x.add(30);
    x.add(11);
    x.add(50);
    System.out.println(x.root.value);
    System.out.println(x.root.left.value);
    System.out.println(x.root.right.value);

    System.out.println(x.root.right.right.value);


    System.out.println(x.contains(20));
    System.out.println(x.contains(10));
    System.out.println(x.contains(11));
  }
}
