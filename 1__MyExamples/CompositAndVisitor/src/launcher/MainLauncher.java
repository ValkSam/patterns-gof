package launcher;

import menu.BistroMenu;
import menu.Menu;
import menu.MenuItem;
import menu.MenuIterator;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class MainLauncher implements Launcher {
    @Override
    public void run() {
        Menu dish1 = new MenuItem("dish1", "dish_description_1", false, 11d);
        Menu dish2 = new MenuItem("dish2", "dish_description_2", false, 12d);
        Menu dish3 = new MenuItem("dish3", "dish_description_3", true, 13d);
        Menu dish4 = new MenuItem("dish4", "dish_description_4", true, 14d);
        Menu dish5 = new MenuItem("dish5", "dish_description_5", true, 14d);
        /**/
        BistroMenu menuSummer = new BistroMenu("ОБЩЕЕ МЕНЮ");
        /**/
        BistroMenu menuSummerMeat = new BistroMenu("МЯСНОЕ МЕНЮ");
        menuSummerMeat.add(dish1);
        menuSummerMeat.add(dish2);
        menuSummer.add(menuSummerMeat);
        /**/
        BistroMenu menuSummerVeg = new BistroMenu("ОВОЩНОЕ МЕНЮ");
        menuSummerVeg.add(dish3);
        menuSummerVeg.add(dish4);
        menuSummerVeg.add(dish5);
        menuSummer.add(menuSummerVeg);


        System.out.println("=================");

        MenuIterator menuSummerVegItr = menuSummerVeg.getIterator();
        while (menuSummerVegItr.hasNext()) {
            System.out.println(menuSummerVegItr.next());
        }

        System.out.println("-----------------");
        menuSummerVegItr = menuSummerVeg.getIterator();
        menuSummerVegItr.next();
        menuSummerVegItr.delete();

        System.out.println("------------------");
        menuSummerVegItr = menuSummerVeg.getIterator();
        while (menuSummerVegItr.hasNext()) {
            System.out.println(menuSummerVegItr.next());
        }
    }
}
