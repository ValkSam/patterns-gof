package composit;

import launcher.FileLauncher;
import launcher.LinkLauncher;

public class Main {

    public static void main(String[] args) {
        System.out.println("FILES: ");
        new FileLauncher().run();
        System.out.println("================================");
        System.out.println("LINKS: ");
        new LinkLauncher().run();
    }
}
