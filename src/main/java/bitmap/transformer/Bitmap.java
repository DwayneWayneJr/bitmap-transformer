package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
// properties go here
BufferedImage img = null;

//    constructor method
    public Bitmap(String inputPath, String outputPath, String transform) throws IOException {
        try {
            img = ImageIO.read(new File("resources/mario.bmp"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void flipVertically() {
    }

//    static boolean ImageIO.write(RenderedImage im, String formatName, File output)  throws IOException {
    public void save() throws IOException {

        ImageIO.write(img, "bmp", new File("resources/mario_test.bmp"));
    }
}
