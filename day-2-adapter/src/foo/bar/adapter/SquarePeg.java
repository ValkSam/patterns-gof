package foo.bar.adapter;

/* The OLD, or ADAPTEE */
public class SquarePeg {

    private double width;

    public SquarePeg(double w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

}
