package menu;

/**
 * Created by ValkSam on 29.10.2016.
 */
public interface MenuIterator {
    boolean hasNext();
    Menu next();
    void delete();
}
