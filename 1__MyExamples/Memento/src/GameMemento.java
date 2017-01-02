/**
 * Created by ValkSam on 30.10.2016.
 */
public class GameMemento implements PrevoiusStateMemento, PreviousStateOriginator {
    private final int tanks;
    private final int drivers;

    public GameMemento(int tanks, int drivers) {
        this.tanks = tanks;
        this.drivers = drivers;
    }

    public int getTanks() {
        return tanks;
    }

    public int getDrivers() {
        return drivers;
    }
}
