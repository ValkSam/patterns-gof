import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PrevoiusStateMemento> stateMementos = new ArrayList<>();
        GameOriginator gameOriginator = new GameOriginator();
        gameOriginator.play();
        gameOriginator.play();
        stateMementos.add(gameOriginator.save()); //0
        gameOriginator.play();
        gameOriginator.play();
        stateMementos.add(gameOriginator.save()); //1
        gameOriginator.load(stateMementos.get(0));
        gameOriginator.play();
        gameOriginator.load(stateMementos.get(1));
    }

}
