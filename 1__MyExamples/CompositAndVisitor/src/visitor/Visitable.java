package visitor;

/**
 * Created by ValkSam on 30.10.2016.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
