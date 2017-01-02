package observerPattern.state;

import observerPattern.model.Flight;

import static observerPattern.model.FlightStateEnum.DOCKED;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class FlightStateDocked extends FlightState {
    {
        stateId = DOCKED;
    }

    public FlightStateDocked(FlightStateContext context) {
        super(context);
    }

    @Override
    void handleState(Flight flight, Boolean handleAndStop) {
        System.out.println(flight + "Стою в ангаре");
        context.nextState(flight, handleAndStop);
    }
}
