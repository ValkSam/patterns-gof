package foo.bar.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

    private final static int WEIGHT_ITERATIONS = 10000;

    private Color color;

    private StringBuffer weight = new StringBuffer();

    public Circle(Color color) {
        this.color = color;

        // adding weight for this realy light object
        for (int i = 0; i < WEIGHT_ITERATIONS; i++) {
            weight.append("This is weight object!");
        }
    }

    public void draw(Graphics g, int x, int y, int r) {
        g.setColor(color);
        g.drawOval(x, y, r, r);
    }

}
