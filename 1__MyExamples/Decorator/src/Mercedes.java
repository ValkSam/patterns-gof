/**
 * Created by ValkSam on 16.10.2016.
 */
public class Mercedes extends Car {

    public Mercedes() {
        this.speed = 100;
        this.sound = "";
    }

    @Override
    public String go() {
        return "speed: "+speed+" sound: "+sound;
    }

    @Override
    protected int getSpeed() {
        return speed;
    }

    @Override
    protected String getSound() {
        return sound;
    }
}
