package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class AccessoryMacintosh extends Accessory {
    private String accessoryName = "Плащ";

    public AccessoryMacintosh(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public String getDressName() {
        return super.getDressName().concat(", ").concat(accessoryName);
    }
}
