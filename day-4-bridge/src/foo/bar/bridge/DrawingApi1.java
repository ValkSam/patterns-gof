package foo.bar.bridge;

public class DrawingApi1 implements DrawingApi {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API-1.circle at %f:%f radius %f\n", x, y, radius);
    }

}
