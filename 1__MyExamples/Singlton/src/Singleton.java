/**
 * Created by ValkSam on 19.10.2016.
 */
public class Singleton {
    public String a = "aaaaa";

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private Singleton() {
    }
}
