package foo.bar.strategy;

public class ConcreteStrategyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd\'s execute()");
        return a + b;
    }

}
