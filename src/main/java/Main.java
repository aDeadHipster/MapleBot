import org.opencv.core.Core;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Thread.*;

public class Main {

    // Compulsory
    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {
        BufferedImage screen = ScreenCapturer.captureScreen();

        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(new JLabel(new ImageIcon(screen)));
        frame.pack();
        //frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("3 seconds, get ready");
        try {
            sleep(3000);

            int i = 0;
            while (i < 1000) {
                Actions.jump();
                System.out.println("walking..." + i);
                sleep(330);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}