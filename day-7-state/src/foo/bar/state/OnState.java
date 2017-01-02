package foo.bar.state;

public class OnState extends State {

    private static OnState inst = null;

    public static synchronized State getInstance() {
        if (inst == null) {
            return new OnState();
        } else {
            return inst;
        }
    }
}
