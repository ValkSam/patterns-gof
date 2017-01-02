package visitor;

import menu.BistroMenu;
import menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 30.10.2016.
 */
public class VisitorCat implements Visitor {
    List<MenuItem> listItem = new ArrayList();

    @Override
    public void visit(BistroMenu menu) {

    }

    @Override
    public void visit(MenuItem menu) {
        listItem.add(menu);
    }

    public void print() {
        for (MenuItem menuItem : listItem) {
            System.out.println(menuItem.getDescription());
        }
    }
}
