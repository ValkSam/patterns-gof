package bar.foo.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape implements Shape {

    private List<Shape> shapeList = new ArrayList<Shape>();

    public void addToShape(Shape shapeToAddToCurrentShape) {

        shapeList.add(shapeToAddToCurrentShape);

    }

    public Shape[] explodeShape() {

        return (Shape[]) shapeList.toArray();
    }

    public void renderShapeToScreen() {

        for (Shape s : shapeList) {

            // use delegation to handle this method
            s.renderShapeToScreen();

        }
    }
}
