import java.awt.*;

public class Circulo extends Figura {

    Point p1;
    Point p2;
    Color color;
    
    public Circulo(Point p1, Point p2, Color c) {
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
        this.color = c;
    }

}
