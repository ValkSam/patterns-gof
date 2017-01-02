package foo.bar.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee sampleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: "
                + sampleCoffee.getIngredient());

        sampleCoffee = new Sprinkles(sampleCoffee);
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: "
                + sampleCoffee.getIngredient());

        sampleCoffee = new Milk(sampleCoffee);
        System.out.println("Cost: " + sampleCoffee.getCost() + " Ingredient: "
                + sampleCoffee.getIngredient());

        // Coffee myCoffee = new Sprinkles(new Milk(new SimpleCoffee()));
        //
        // // Coffee mc, sp, milk;
        //
        // Coffee sc = new SimpleCoffee();
        // Coffee sp = new Sprinkles(sc);
        // Coffee milk = new Milk(sp);

    }

}
