package foo.bar.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;
    protected String ingredientSeparator;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
        ingredientSeparator = ", ";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getIngredient() {
        return decoratedCoffee.getIngredient();
    }

}
