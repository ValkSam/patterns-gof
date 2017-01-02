package foo.bar.builder;

public class BuilderExample {

    public static void main(String[] args) {

        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizza();

        Pizza hawaiian = cook.getPizza();
        System.out.println(hawaiian);

        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        cook.setPizzaBuilder(spicyPizzaBuilder);
        cook.constructPizza();

        Pizza spicy = cook.getPizza();
        System.out.println(spicy);

    }

}
