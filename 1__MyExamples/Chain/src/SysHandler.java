/**
 * Created by ValkSam on 22.10.2016.
 */
public class SysHandler implements Handler{
    private Handler nextHandler;

    public SysHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void printHelp(String message){
        if (message.contains("system")){
            System.out.println("I am system");
            return;
        }
        System.out.println(" cannot be processed !");;
    }
}
