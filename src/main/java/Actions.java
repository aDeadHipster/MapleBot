import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by jwpra on 12/18/2017.
 */
public class Actions {

    public enum DirEnum {LEFT, RIGHT}

    public static void walk(DirEnum dir) {
        try {
            Robot r = new Robot();
            if (dir == DirEnum.LEFT) {
                r.keyPress(KeyEvent.VK_LEFT);
                r.keyRelease(KeyEvent.VK_LEFT);
            } else {
                r.keyPress(KeyEvent.VK_RIGHT);
                r.keyRelease(KeyEvent.VK_RIGHT);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void jump() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ALT);
            r.keyRelease(KeyEvent.VK_ALT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void teleport(DirEnum dir) {
        if (dir == DirEnum.LEFT) {
            // simulate left tp
        } else {
            // simulate right tp
        }
    }
}
