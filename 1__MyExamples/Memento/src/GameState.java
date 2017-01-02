/**
 * Created by ValkSam on 30.10.2016.
 */
public class GameState {
    private int tankCount;
    private int driverCount;
    /**/

    public GameState(int tankCount, int driverCount) {
        this.tankCount = tankCount;
        this.driverCount = driverCount;
    }
/**/

    public int getTankCount() {
        return tankCount;
    }

    public int getDriverCount() {
        return driverCount;
    }

    public void setTankCount(int tankCount) {
        this.tankCount = tankCount;
    }

    public void setDriverCount(int driverCount) {
        this.driverCount = driverCount;
    }

    @Override
    public String toString() {
        return "GameState{" +
                "tankCount=" + tankCount +
                ", driverCount=" + driverCount +
                '}';
    }
}
