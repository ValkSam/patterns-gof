package foo.bar.state;

public class OffState extends State {

    private static OffState inst = null;

    public static synchronized State getInstance() {
        if (inst == null) {
            return new OffState();
        } else {
            return inst;
        }
    }

    // 6. Override only the necessary methods
    public void push(Button b) {
        // 7. The "wrappee" may callback to the "wrapper"
        b.setCurrent(OnState.getInstance());
        System.out.println(" turning ON");
    }

}
