/**
 * Created by ValkSam on 16.10.2016.
 */
public abstract class Car {
    int speed;
    String sound;

    abstract public String go();

    abstract protected int getSpeed();

    abstract protected String getSound();

}
