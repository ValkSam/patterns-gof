package foo.bar.prototype;

public abstract class Prototype implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        // call Object.clone()
        Prototype copy = (Prototype) super.clone();
        // In an actual implementation of this pattern you might now change
        // references to
        // the expensive to produce parts from the copies that are held inside
        // the prototype.
        return copy;
    }

    abstract void setValue(int x);

    abstract void printValue();

}
