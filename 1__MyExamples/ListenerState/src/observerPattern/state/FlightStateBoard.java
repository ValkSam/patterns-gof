package observerPattern.state;

import observerPattern.model.Flight;

import static observerPattern.model.FlightStateEnum.ONBOARD;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class FlightStateBoard extends FlightState {
    {
        stateId = ONBOARD;
    }

    public FlightStateBoard(FlightStateContext context) {
        super(context);
    }

    @Override
    void handleState(Flight flight, Boolean handleAndStop) {
        System.out.println(flight + "Загружаюсь");
        context.nextState(flight, handleAndStop);
    }
}
