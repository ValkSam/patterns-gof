public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Handler sysHandler = new SysHandler(null);
        Handler windowHandler = new WindowHandler(sysHandler);
        Handler buttonHandler = new ButtonHandler(windowHandler);
        buttonHandler.printHelp("but ton");
        /**/
        Priority priority = new Priority(100);
        Priority priority1 = (Priority) priority.clone();
        priority.setNumber(200);
        System.out.println(priority);
        System.out.println(priority1);
    }
}

class Priority implements Cloneable {
    private int number;

    public Priority(int number) {
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Priority{" +
                "number=" + number +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
