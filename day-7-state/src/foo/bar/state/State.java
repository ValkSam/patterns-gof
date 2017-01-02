package foo.bar.state;

public class State {
    // 5. Default behavior can go in the base class
    public void push(Button b) {
        b.setCurrent(OffState.getInstance());
        System.out.println("   turning OFF");
    }

}
