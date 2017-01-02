package visitor;

import menu.BistroMenu;
import menu.MenuItem;

/**
 * Created by ValkSam on 30.10.2016.
 */
public interface Visitor {
    void visit(BistroMenu menu);

    void visit(MenuItem menu);
}
