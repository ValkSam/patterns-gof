package foo.bar.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, new DrawingApi1()),
                new CircleShape(5, 7, 11, new DrawingApi2()), };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }

}
