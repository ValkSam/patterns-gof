package observerPattern.observer;

import observerPattern.model.Flight;
import observerPattern.observable.AirportInformer;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class TabloObserver implements Observer {
    public void update(AirportInformer airportInformer) {
        System.out.println("========== TABLO info ===========");
        for (Flight flight : airportInformer.getManagedFlightList()) {
            System.out.println(flight +
                    " status: " + (flight.equals(airportInformer.getChangedFlight()) ? "changed" : ""));
        }
    }
}
