package foo.bar.command;

public class PressSwitch {

    public static void main(String[] args) {

        Light lamp = new Light();
        Command switchOn = new FlipUpCommand(lamp);
        Command switchOff = new FlipDownCommand(lamp);

        Switch s = new Switch();

        try {
            if (args[0].equalsIgnoreCase("ON")) {
                s.flip(switchOn);
            } else if (args[0].equalsIgnoreCase("OFF")) {
                s.flip(switchOff);
            } else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }

}
