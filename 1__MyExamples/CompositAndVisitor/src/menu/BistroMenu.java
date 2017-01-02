package menu;

import visitor.Visitable;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 16.10.2016.
 */
public class BistroMenu implements Menu, Visitable {
    protected List<Menu> menuItemList = new ArrayList<Menu>();
    private Menu parent;
    private String description;

    public BistroMenu(String description) {
        this.description = description;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Menu m : menuItemList) {
            m.accept(visitor);
        }
    }

    /**/
    @Override
    public boolean isDish() {
        return false;
    }

    public String getDescription() {
        return description;
    }

    public List<Menu> getItems() {
        List list = new ArrayList();
        for (Menu menuItem : menuItemList) {
            list.addAll(menuItem.getItems());
        }
        return list;
    }

    @Override
    public double getPrice() {
        double result = 0;
        for (Menu menuItem : menuItemList) {
            result += menuItem.getPrice();
        }
        return result;
    }

    @Override
    public void printItem() {
        for (Menu menuItem : menuItemList) {
            menuItem.printItem();
        }
    }

    /**/
    public void add(Menu menu) {
        if (menu.isDish()) {
            ((MenuItem) menu).parent = this;
        } else {
            ((BistroMenu) menu).parent = this;
        }
        menuItemList.add(menu);
    }

    private class Itr implements MenuIterator {
        private int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < getItems().size();
        }

        @Override
        public Menu next() {
            List<Menu> list = getItems();
            return list.get(currentPosition++);
        }

        @Override
        public void delete() {
            List<Menu> list = getItems();
            Menu menu = list.get(currentPosition);
            Menu menuParent;
            if (menu.isDish()) {
                menuParent = ((MenuItem) menu).parent;
            } else {
                menuParent = ((BistroMenu) menu).parent;
            }
            if (!menuParent.isDish()) {
                ((BistroMenu) menuParent).menuItemList.remove(menu);
            }
        }
    }

    public MenuIterator getIterator() {
        return new Itr();
    }


}
