package observerPattern.observable;

import observerPattern.model.Flight;
import observerPattern.model.FlightStateEnum;
import observerPattern.observer.Observer;
import observerPattern.state.FlightStateContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class AirportInformer {
    private static volatile AirportInformer instance;
    /**/
    private List<Flight> managedFlightList = new ArrayList<>();

    private List<Observer> observerList = new ArrayList<>();

    private Flight changedFlight;

    /**/
    public void addFlightAsManaged(Flight flight) {
        managedFlightList.add(flight);
    }

    public void removeFlightAsManaged(Flight flight) {
        managedFlightList.remove(flight);
    }

    public void addOserver(Observer observer) {
        observerList.add(observer);
    }

    public void updateFlightState(Flight flight) {
        System.out.println("flight state changed");
        changedFlight = flight;
        /**/
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    /*get Instance*/
    public static AirportInformer getInstance() {
        if (instance == null) {
            synchronized (AirportInformer.class) {
                if (instance == null) {
                    instance = new AirportInformer();
                }
            }
        }
        return instance;
    }

    /*constructor*/
    private AirportInformer() {
    }

    /*getters setters*/
    public Flight getChangedFlight() {
        return changedFlight;
    }

    public List<Flight> getManagedFlightList() {
        return managedFlightList;
    }
}


