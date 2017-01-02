package observerPattern;

import observerPattern.model.Flight;
import observerPattern.observable.AirportInformer;
import observerPattern.observer.Observer;
import observerPattern.observer.SmsObserver;
import observerPattern.observer.TabloObserver;
import observerPattern.state.FlightStateContext;

import static observerPattern.model.FlightType.CHARTER;
import static observerPattern.model.FlightType.REGULAR;

public class Main {

    public static void main(String[] args) {
        FlightStateContext flightStateContext = FlightStateContext.getInstance();
        AirportInformer airportInformer = AirportInformer.getInstance();
        Flight flight767 = new Flight(767, CHARTER);
        Flight flight768 = new Flight(768, REGULAR);
        Flight flight769 = new Flight(769, CHARTER);
        airportInformer.addFlightAsManaged(flight767);
        airportInformer.addFlightAsManaged(flight768);
        airportInformer.addFlightAsManaged(flight769);
        /**/
        Observer smsObserver = new SmsObserver(flight768);
        Observer tabloOserver = new TabloObserver();
        airportInformer.addOserver(smsObserver);
        airportInformer.addOserver(tabloOserver);
        /**/
        flightStateContext.handleState(flight767, false);
//        airportInformer.updateFlightState(flight767);
        System.out.println("======================");
        /**/
        flightStateContext.handleState(flight768, false);
//        airportInformer.updateFlightState(flight768);
        System.out.println("======================");
        flightStateContext.handleState(flight768, false);
//        airportInformer.updateFlightState(flight768);
        System.out.println("======================");
        flightStateContext.handleState(flight768, false);
//        airportInformer.updateFlightState(flight768);
        System.out.println("======================");
        flightStateContext.handleState(flight768, true);
//        airportInformer.updateFlightState(flight768);
        System.out.println("======================");
    }
}
