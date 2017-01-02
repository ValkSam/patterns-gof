/**
 * Created by ValkSam on 16.10.2016.
 */
public class ArmedCar extends Decorator {
    public ArmedCar(Car decoratedCar) {
        super(decoratedCar);
        speed = -10;
        sound = "brrrr";
    }

    @Override
    public String go() {
        return "speed: " + getSpeed() + " sound: " + getSound();
    }

    protected int getSpeed() {
        return super.getSpeed() + speed;
    }

    protected String getSound() {
        return super.getSound() + sound;
    }

}
