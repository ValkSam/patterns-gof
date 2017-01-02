package model;

import dress.Dress;

/**
 * Created by ValkSam on 22.10.2016.
 */
public class Human {
private String name;
    private Dress dress;

    public Human(String name) {
        this.name = name;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public Dress getDress() {
        return dress;
    }

    @Override
    public String toString() {
        return  name + " оделся : " + dress.getDressName();
    }
}
