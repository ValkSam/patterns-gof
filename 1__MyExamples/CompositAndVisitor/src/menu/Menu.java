package menu;

import visitor.Visitable;

import java.util.List;

/**
 * Created by ValkSam on 16.10.2016.
 */
public interface Menu extends Visitable {
    boolean isDish();

    double getPrice();

    void printItem();

    List<Menu> getItems();

}
