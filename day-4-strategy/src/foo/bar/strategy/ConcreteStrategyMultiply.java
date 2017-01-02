package foo.bar.strategy;

public class ConcreteStrategyMultiply implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply\'s execute()");
        return a * b;
    }

}
