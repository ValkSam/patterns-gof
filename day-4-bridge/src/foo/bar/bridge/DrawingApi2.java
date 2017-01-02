package foo.bar.bridge;

public class DrawingApi2 implements DrawingApi {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API-2.circle at %f:%f radius %f\n", x, y, radius);
    }

}
