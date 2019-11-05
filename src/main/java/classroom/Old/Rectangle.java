package classroom.Old;

public class Rectangle extends AbstractFigure{
   private Point p1;
    private Point p2;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public int area() {
        System.out.println(((p2.getX()-p1.getX())*(p2.getY()-p1.getY())));
        return 1;
    }

}
