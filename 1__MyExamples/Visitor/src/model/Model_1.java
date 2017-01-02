package model;

import visitor.Visitor;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class Model_1 extends Model {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Model_1{}";
    }
}
