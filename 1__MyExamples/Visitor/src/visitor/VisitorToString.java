package visitor;

import model.Model_1;
import model.Model_2;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class VisitorToString implements Visitor {

    private String toString;

    @Override
    public void visit(Model_1 model) {
        this.toString = "This is toString for Model_1 ".concat(model.toString());
    }

    @Override
    public void visit(Model_2 model) {
        this.toString = "This is toString for Model_2 ".concat(model.toString());
    }

    public String getResult() {
        return toString;
    }
}
