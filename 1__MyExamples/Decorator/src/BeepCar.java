/**
 * Created by ValkSam on 16.10.2016.
 */
public class BeepCar extends Decorator {
    public BeepCar(Car decoratedCar) {
        super(decoratedCar);
        speed = 50;
        sound = "beeep";
    }

    @Override
    public String go() {
        return "speed: " + getSpeed() + " sound: " + getSound();
    }

    protected int getSpeed(){
        return super.getSpeed() + this.speed;
    }

    protected String getSound(){
        return super.getSound() + sound;
    }
}
