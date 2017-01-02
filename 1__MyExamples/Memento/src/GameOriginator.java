/**
 * Created by ValkSam on 30.10.2016.
 */
public class GameOriginator {
    private GameState gameState;

    public GameOriginator() {
        this.gameState = new GameState(10, 5);
    }

    PrevoiusStateMemento save() {
        System.out.println("SAVE: " + gameState);
        PrevoiusStateMemento gameMemento = new GameMemento(
                gameState.getTankCount(),
                gameState.getDriverCount());
        return gameMemento;
    }

    void load(PrevoiusStateMemento gameMemento) {
        System.out.println("LOAD: before: " + gameState);
        int tanks = ((PreviousStateOriginator) gameMemento).getTanks();
        int drivers = ((PreviousStateOriginator) gameMemento).getDrivers();
        GameState gameState = new GameState(tanks, drivers);
        System.out.println("LOAD: after: " + gameState);
        this.gameState = gameState;
    }

    void play() {
        System.out.println("before: " + gameState);
        gameState.setDriverCount(gameState.getDriverCount() - 1);
        gameState.setTankCount(gameState.getTankCount() - 1);
        System.out.println("after: " + gameState);
        System.out.println();
    }
}
