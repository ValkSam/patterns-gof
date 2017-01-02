package bar.foo.composite;

public class Rectangle implements Shape {
    // List of shapes forming the rectangle
    // rectangle is centered around origin
    private Shape[] rectangleEdges = { new Line(-1, -1, 1, -1),
            new Line(-1, 1, 1, 1), new Line(-1, -1, -1, 1),
            new Line(1, -1, 1, 1) };

    @Override
    public void renderShapeToScreen() {
        for (Shape s : rectangleEdges) {
            // delegate to child objects
            s.renderShapeToScreen();
        }
    }

    @Override
    public Shape[] explodeShape() {

        return rectangleEdges;

    }

}
