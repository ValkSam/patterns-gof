package foo.bar.decorator;

public class Sprinkles extends CoffeeDecorator {

    private double cost;
    private String ingredient;

    public Sprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        cost = 0.2;
        ingredient = "Sprinkles";
    }

    public double getCost() {
        return super.getCost() + cost;
    }

    public String getIngredient() {
        return super.getIngredient() + super.ingredientSeparator + ingredient;
    }

}
