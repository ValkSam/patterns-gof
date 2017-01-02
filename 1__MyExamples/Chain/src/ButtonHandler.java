/**
 * Created by ValkSam on 22.10.2016.
 */
public class ButtonHandler implements Handler {
    private Handler nextHandler;

    public ButtonHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void printHelp(String message) {
        if (message.contains("button")) {
            System.out.println("I am button");
            return;
        }
        System.out.println(" I pass to "+nextHandler);
        nextHandler.printHelp(message);
    }
}
