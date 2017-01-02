public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.a);
        /**/
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2.b);
    }
}
