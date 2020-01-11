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
String outputPath;
String inputPath;
//    constructor method
    public Bitmap(String inputPath, String outputPath, String transform) throws IOException {
        try {

            img = ImageIO.read(new File("resources/" + inputPath));
        } catch (IOException e) {
            System.out.println(e);
        }

        this.outputPath = outputPath;
    }

    public void blackScale() {
      int width = img.getWidth();
      int height = img.getHeight();
      for (int x = 0; x < width; x++) {
          for (int y = 0; y < height; y++) {
              img.setRGB(x, y, );
          }
      }
    }

    public void save() throws IOException {

        ImageIO.write(img, "bmp", new File("resources/" + outputPath));
    }
}
