package foo.bar.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements IVisitable {

    private String name;

    private List<Item> items = new ArrayList<Item>();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);

        for (Item itm : items) {
            itm.accept(visitor);
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
