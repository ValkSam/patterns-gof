public class Main {

    public static void main(String[] args) {
        Car car = new Mercedes();
        System.out.println(car.go());
        /**/
        car = new BeepCar(car);
        System.out.println(car.go());
        /**/
        car = new ArmedCar(car);
        System.out.println(car.go());
    }
}
