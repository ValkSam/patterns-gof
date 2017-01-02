package menu;

import visitor.Visitable;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class MenuItem implements Menu, Visitable {
    private String name;
    private String description;
    private boolean vegetaruian;
    private double price;
    protected Menu parent;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**/
    @Override
    public boolean isDish() {
        return true;
    }

    public String getDiscription() {
        return description;
    }

    public List<Menu> getItems() {
        List list = new ArrayList();
        list.add(this);
        return list;
    }

    public MenuItem(String name, String description, boolean vegetaruinn, double price) {
        this.name = name;
        this.description = description;
        this.vegetaruian = vegetaruinn;
        this.price = price;
    }

    /**/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetaruian() {
        return vegetaruian;
    }

    public void setVegetaruian(boolean vegetaruian) {
        this.vegetaruian = vegetaruian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void printItem() {
        System.out.println(this.name);
    }

    /**/

    @Override
    public String toString() {
        return "menu.MenuItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
