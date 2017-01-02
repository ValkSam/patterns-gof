package foo.bar.prototype;

public class PrototypeExample {

    private Prototype prototype; // Could have been a private Cloneable example.

    public PrototypeExample(Prototype example) {
        this.prototype = example;
    }

    public Prototype makeCopy() throws CloneNotSupportedException {
        return (Prototype) this.prototype.clone();
    }

    public static void main(String args[]) {
        try {
            Prototype temp = null;
            int num = 1000;
            Prototype prot = new ConcretePrototype(1000);
            PrototypeExample cm = new PrototypeExample(prot);
            for (int i = 0; i < 10; i++) {
                temp = cm.makeCopy();
                temp.setValue(i * num);
                temp.printValue();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
