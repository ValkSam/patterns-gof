package observerPattern.state;

import observerPattern.model.Flight;

import static observerPattern.model.FlightStateEnum.FLY;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class FlightStateFly extends FlightState {
    {
        stateId = FLY;
    }

    public FlightStateFly(FlightStateContext context) {
        super(context);
    }

    @Override
    void handleState(Flight flight, Boolean handleAndStop) {
        System.out.println(flight + "Лечу-у-у !!!!");
        context.nextState(flight, handleAndStop);
    }
}
