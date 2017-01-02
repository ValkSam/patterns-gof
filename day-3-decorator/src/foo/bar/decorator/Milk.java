package foo.bar.decorator;

public class Milk extends CoffeeDecorator {

    private double cost;
    private String ingredient;

    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        cost = 0.5;
        ingredient = "Milk";
    }

    public double getCost() {
        return super.getCost() + cost;
    }

    public String getIngredient() {
        return super.getIngredient() + super.ingredientSeparator + ingredient;
    }

}
