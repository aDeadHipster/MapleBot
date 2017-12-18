/**
 * Created by jwpra on 12/18/2017.
 */

import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenCapturer {

    public static final Rectangle AREA_MAPLE = new Rectangle(3, 32, 800, 600);
    public static final Rectangle AREA_EQUIPMENT = new Rectangle(0, 0, 0, 0);

    public static BufferedImage captureScreen() {
        try {
            Robot robot = new Robot();
            return robot.createScreenCapture(AREA_MAPLE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage getAreaOfScreenshot(BufferedImage screenShot, Rectangle area) {
        BufferedImage newArea = screenShot.getSubimage(area.x, area.y, area.width, area.height);
        BufferedImage copyOfImage = new BufferedImage(newArea.getWidth(), newArea.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = copyOfImage.createGraphics();
        g.drawImage(newArea, 0, 0, null);
        return copyOfImage; //or use it however you want

    }
}
