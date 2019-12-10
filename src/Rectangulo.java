import java.awt.*;

public class Rectangulo extends Figura {
    
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    Color color;
    
    public Rectangulo(Point p1, Point p2, Color c) {
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
        this.p3 = new Point(p2.x, p1.y);
        this.p4 = new Point(p1.x, p2.y);
        this.color = c;
    }
    
    public Rectangulo(Point p1, Point p2, Point p3, Point p4, Color c) {
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
        this.p3 = new Point(p3.x, p3.y);
        this.p4 = new Point(p4.x, p4.y);
        this.color = c;
    }

}
