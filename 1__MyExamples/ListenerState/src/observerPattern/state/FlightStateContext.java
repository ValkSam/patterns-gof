package observerPattern.state;

import observerPattern.model.Flight;
import observerPattern.model.FlightStateEnum;

import static observerPattern.model.FlightStateEnum.*;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class FlightStateContext {
    private static volatile FlightStateContext instance;

    /**/
    private FlightState flightStateDocked = new FlightStateDocked(this);
    private FlightState flightStateBoard = new FlightStateBoard(this);
    private FlightState flightStateFly = new FlightStateFly(this);
    private FlightState flightStateArrived = new FlightStateArrived(this);

    /**/
    public void handleState(Flight flight, Boolean handleAndStop) {
        flight.getFlightState().handleState(flight, handleAndStop);
    }

    protected void nextState(Flight flight, Boolean handleAndStop) {
        FlightState currentFlightState = flight.getFlightState();
        FlightState newFlightState;
        if (handleAndStop && currentFlightState.getStateId() != ARRIVED) {
            throw new RuntimeException("Нельзя закончить работу из состояния " + currentFlightState.getStateId());
        }
        if (handleAndStop) {
            newFlightState = flightStateDocked;
        } else {
            FlightStateEnum state = currentFlightState.stateId;
            if (state == DOCKED) {
                newFlightState = flightStateBoard;
            } else if (state == ONBOARD) {
                newFlightState = flightStateFly;
            } else if (state == FLY) {
                newFlightState = flightStateArrived;
            } else if (state == ARRIVED) {
                newFlightState = flightStateBoard;
            } else {
                throw new RuntimeException("Не могу определить следующее состояние");
            }
        }
        System.out.println(flight + " сменил состояние на " + newFlightState.getStateId());
        flight.setFlightState(newFlightState);
    }

    public FlightState getInitialState() {
        return flightStateDocked;
    }

    /*get Instance*/
    public static FlightStateContext getInstance() {
        if (instance == null) {
            synchronized (FlightStateContext.class) {
                if (instance == null) {
                    instance = new FlightStateContext();
                }
            }
        }
        return instance;
    }

    /*constructor*/
    private FlightStateContext() {
    }

}
