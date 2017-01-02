package strategy;

import dress.AccessoryMacintosh;
import dress.AccessoryUmbrella;
import dress.Dress;
import model.Human;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class RainWearingStrategy implements WearingStrategy {
    @Override
    public void dressHuman(Human human) {
        Dress rainDress = new AccessoryMacintosh(new AccessoryUmbrella(human.getDress()));
        human.setDress(rainDress);
    }
}
