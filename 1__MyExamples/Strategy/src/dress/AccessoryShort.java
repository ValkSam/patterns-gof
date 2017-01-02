package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class AccessoryShort extends Accessory {
    private String accessoryName = "Шорты";

    public AccessoryShort(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public String getDressName() {
        return super.getDressName().concat(", ").concat(accessoryName);
    }
}
