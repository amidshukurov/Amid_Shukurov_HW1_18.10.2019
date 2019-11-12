package classroom.ZOld;

public class Triangle extends AbstractFigure{
    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int area() {
        //(x2, y2), (x3, y3) or (2, 1), (8, 9), (1, 8): A = (x1y2 + x2y3 + x3y1 – x1y3 – x2y1 – x3y2)/2.
        return 1;
    }

    public Point getP3() {
        return p3;
    }
}
