package foo.bar.decorator;

public class SimpleCoffee implements Coffee {

    private double cost;
    private String ingredient;

    public SimpleCoffee() {
        cost = 1;
        ingredient = "Coffee";
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getIngredient() {
        return ingredient;
    }

}
