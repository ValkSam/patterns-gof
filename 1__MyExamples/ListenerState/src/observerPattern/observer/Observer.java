package observerPattern.observer;

import observerPattern.observable.AirportInformer;

/**
 * Created by ValkSam on 16.10.2016.
 */
public interface Observer {
    void update(AirportInformer subject);
}
