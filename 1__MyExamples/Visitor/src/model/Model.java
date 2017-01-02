package model;

import visitor.Visitor;

/**
 * Created by ValkSam on 23.10.2016.
 */
public abstract class Model {
    public abstract void accept(Visitor visitor);
}
