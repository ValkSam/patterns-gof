package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public abstract class Accessory implements Dress{
    private Dress decoratedDress;

    public Accessory(Dress decoratedDress) {
        this.decoratedDress = decoratedDress;
    }

    @Override
    public String getDressName() {
        return decoratedDress.getDressName();
    }
}
