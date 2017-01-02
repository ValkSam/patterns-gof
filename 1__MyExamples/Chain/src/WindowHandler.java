/**
 * Created by ValkSam on 22.10.2016.
 */
public class WindowHandler implements Handler{
    private Handler nextHandler;

    public WindowHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void printHelp(String message){
        if (message.contains("window")){
            System.out.println("I am window");
            return;
        }
        System.out.println(" I pass to "+nextHandler);
        nextHandler.printHelp(message);
    }
}
