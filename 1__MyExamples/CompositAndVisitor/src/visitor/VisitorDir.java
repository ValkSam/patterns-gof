package visitor;

import menu.BistroMenu;
import menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ValkSam on 30.10.2016.
 */
public class VisitorDir implements Visitor {
    List<BistroMenu> listMenu = new ArrayList();
    List<MenuItem> listItem = new ArrayList();

    @Override
    public void visit(BistroMenu menu) {
        listMenu.add(menu);
    }

    @Override
    public void visit(MenuItem menu) {
        listItem.add(menu);
    }

    public void print() {
        for (BistroMenu bistroMenu : listMenu) {
            System.out.println(bistroMenu.getDescription());
        }
        for (MenuItem menuItem : listItem) {
            menuItem.printItem();
        }
    }
}
