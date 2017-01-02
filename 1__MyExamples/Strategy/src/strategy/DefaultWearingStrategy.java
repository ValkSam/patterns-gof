package strategy;

import dress.BaseDress;
import dress.Dress;
import model.Human;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class DefaultWearingStrategy implements WearingStrategy {
    @Override
    public void dressHuman(Human human) {
        Dress baseDress = new BaseDress();
        human.setDress(baseDress);
    }
}
