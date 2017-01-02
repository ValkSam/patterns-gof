package foo.bar.bridge;

public class CircleShape implements Shape {
    private double x, y, radius;
    private DrawingApi drawingApi;

    public CircleShape(double x, double y, double radius, DrawingApi drawingApi) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingApi = drawingApi;
    }

    // low-level i.e. Implementation specific
    public void draw() {
        drawingApi.drawCircle(x, y, radius);
    }

    // high-level i.e. Abstraction specific
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }

}
