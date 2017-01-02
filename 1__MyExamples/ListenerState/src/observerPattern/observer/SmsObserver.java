package observerPattern.observer;

import observerPattern.model.Flight;
import observerPattern.observable.AirportInformer;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class SmsObserver implements Observer {
    private Flight flightForMonitoring;

    public SmsObserver(Flight flightForMonitoring) {
        this.flightForMonitoring = flightForMonitoring;
    }

    public void update(AirportInformer airportInformer) {
        Flight changedFlight = airportInformer.getChangedFlight();
        System.out.println("========== SMS info ===========");
        if (changedFlight.equals(flightForMonitoring)) {
            System.out.println(changedFlight);
        }
    }
}
