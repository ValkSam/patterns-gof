package foo.bar.state;

public class Button {

    // 2. The "current" state object // OFF ON
    private State current;

    public Button() {
        current = OffState.getInstance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    // 3. The "wrapper" always delegates to the "wrappee"
    public void push() {
        current.push(this);
    }

}
