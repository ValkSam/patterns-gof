package launcher;

import menu.BistroMenu;
import menu.Menu;
import menu.MenuItem;
import visitor.VisitorCat;
import visitor.VisitorDir;

/**
 * Created by ValkSam on 23.10.2016.
 */
public class VisitorLauncher implements Launcher {
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


        System.out.println("====== DIR menuSummer===========");
        VisitorDir visitorDir = new VisitorDir();
        menuSummer.accept(visitorDir);
        visitorDir.print();

        System.out.println("====== DIR menuSummerMeat===========");
        VisitorDir visitorDir1 = new VisitorDir();
        menuSummerMeat.accept(visitorDir1);
        visitorDir1.print();

        System.out.println("=======DIR menuSummerVeg==========");
        VisitorDir visitorDir2 = new VisitorDir();
        menuSummerVeg.accept(visitorDir2);
        visitorDir2.print();

        System.out.println("========CAT menuSummerMeat=========");
        VisitorCat visitorCat1 = new VisitorCat();
        menuSummerMeat.accept(visitorCat1);
        visitorCat1.print();

    }
}
