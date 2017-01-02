package strategy;

import model.Human;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class WeatherStrategy {
    private WearingStrategy wearingStrategy;

    public WeatherStrategy(WearingStrategy wearingStrategy) {
        this.wearingStrategy = wearingStrategy;
    }

    public void dressHuman(Human human){
        wearingStrategy.dressHuman(human);

    }
}
