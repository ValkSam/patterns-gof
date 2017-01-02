package foo.bar.prototype;

public class ConcretePrototype extends Prototype {

    private int x;

    public ConcretePrototype(int x) {
        this.x = x;
    }

    void setValue(int x) {
        this.x = x;
    }

    void printValue() {
        System.out.println("Value :" + x);
    }
}
