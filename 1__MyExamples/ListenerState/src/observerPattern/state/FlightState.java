package observerPattern.state;

import observerPattern.model.Flight;
import observerPattern.model.FlightStateEnum;

/**
 * Created by ValkSam on 22.10.2016.
 */
public abstract class FlightState {
    FlightStateEnum stateId;
    FlightStateContext context;

    public FlightState(FlightStateContext context) {
        this.context = context;
    }

    abstract void handleState(Flight flight, Boolean handleAndStop);

    public FlightStateEnum getStateId() {
        return stateId;
    }
}
