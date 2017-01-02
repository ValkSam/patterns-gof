package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class AccessoryUmbrella extends Accessory {
    private String accessoryName = "Зонтик";

    public AccessoryUmbrella(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public String getDressName() {
        return super.getDressName().concat(", ").concat(accessoryName);
    }
}
