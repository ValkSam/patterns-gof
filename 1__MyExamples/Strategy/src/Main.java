import model.Human;
import strategy.DefaultWearingStrategy;
import strategy.RainWearingStrategy;
import strategy.SunShineWearingStrategy;
import strategy.WeatherStrategy;

public class Main {

    public static void main(String[] args) {
        Human humanVasia = new Human("Вася");
        System.out.println("Сейчас солнышко");
        WeatherStrategy weatherStrategy = new WeatherStrategy(new DefaultWearingStrategy());
        weatherStrategy.dressHuman(humanVasia);
        /**/
        weatherStrategy = new WeatherStrategy(new SunShineWearingStrategy());
        weatherStrategy.dressHuman(humanVasia);
        System.out.println(humanVasia);
        System.out.println();
        /**/
        System.out.println("Сейчас дождик");
        weatherStrategy = new WeatherStrategy(new DefaultWearingStrategy());
        weatherStrategy.dressHuman(humanVasia);
        /**/
        weatherStrategy = new WeatherStrategy(new RainWearingStrategy());
        weatherStrategy.dressHuman(humanVasia);
        System.out.println(humanVasia);
        System.out.println();
    }

}
