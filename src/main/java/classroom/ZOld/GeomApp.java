package classroom.ZOld;

public class GeomApp {
    public static void main(String[] args) {
        Point p1 = new Point(71,55);
        Point p2 = new Point(4,5);
        Rectangle rectangle = new Rectangle(p1,p2);
        rectangle.area();
    }
}
