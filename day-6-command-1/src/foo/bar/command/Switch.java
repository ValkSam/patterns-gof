package foo.bar.command;

/* The Invoker class */
public class Switch {

    public void flip(Command command) {
        command.execute();
    }
}
