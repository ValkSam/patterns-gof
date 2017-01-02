package visitor;

import model.Model;
import model.Model_1;
import model.Model_2;

/**
 * Created by ValkSam on 23.10.2016.
 */
public interface Visitor {
    abstract void visit(Model_1 model);
    abstract void visit(Model_2 model);
}
