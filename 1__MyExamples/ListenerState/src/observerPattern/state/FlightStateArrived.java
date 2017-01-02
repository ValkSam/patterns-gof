package observerPattern.state;

import observerPattern.model.Flight;

import static observerPattern.model.FlightStateEnum.ARRIVED;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class FlightStateArrived extends FlightState {
    {
        stateId = ARRIVED;
    }

    public FlightStateArrived(FlightStateContext context) {
        super(context);
    }

    @Override
    void handleState(Flight flight, Boolean handleAndStop) {
        System.out.println(flight + "Прибываю");
        context.nextState(flight, handleAndStop);
    }
}
