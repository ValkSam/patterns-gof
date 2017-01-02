package strategy;

import dress.AccessoryShort;
import dress.AccessorySunglasses;
import dress.Dress;
import model.Human;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class SunShineWearingStrategy implements WearingStrategy {
    @Override
    public void dressHuman(Human human) {
        Dress sunshineDress = new AccessoryShort(new AccessorySunglasses(human.getDress()));
        human.setDress(sunshineDress);
    }
}
