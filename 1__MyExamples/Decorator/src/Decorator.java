/**
 * Created by ValkSam on 16.10.2016.
 */
public abstract class Decorator extends Car {
    private Car decoratedCar;

    Decorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    protected int getSpeed(){
        return decoratedCar.getSpeed();
    }

    protected String getSound(){
        return decoratedCar.getSound();
    }

}
