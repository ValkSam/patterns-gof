package observerPattern.model;

import observerPattern.state.FlightState;
import observerPattern.state.FlightStateContext;
import observerPattern.state.FlightStateDocked;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class Flight {
    private int flightNumber;
    private FlightState flightState = FlightStateContext.getInstance().getInitialState();
    private FlightType flightType;

    /**/

    public Flight(int flightNumber, FlightType flightType) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    /**/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightNumber == flight.flightNumber;

    }

    @Override
    public int hashCode() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", flightState=" + flightState.getStateId() +
                ", flightType=" + flightType +
                '}';
    }
}
