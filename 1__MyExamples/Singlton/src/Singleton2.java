/**
 * Created by ValkSam on 19.10.2016.
 */
public class Singleton2 {
    private static Singleton2 instance;
    public String b = "bbbbb";

    static {
        Singleton2.instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    private Singleton2() {
    }
}
