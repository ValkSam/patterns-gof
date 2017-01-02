package dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class AccessorySunglasses extends Accessory {
    private String accessoryName = "Солнезащитные очки";

    public AccessorySunglasses(Dress decoratedDress) {
        super(decoratedDress);
    }

    @Override
    public String getDressName() {
        return super.getDressName().concat(", ").concat(accessoryName);
    }
}
