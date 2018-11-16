package testopencv;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacpp.opencv_core.Mat;
import static org.bytedeco.javacpp.opencv_highgui.cvShowImage;
import static org.bytedeco.javacpp.opencv_highgui.cvWaitKey;
import static org.bytedeco.javacpp.opencv_imgcodecs.cvLoadImage;
import org.bytedeco.javacpp.opencv_videoio;
/**
 *
 * @author Jarviz
 */
public class TestOpenCV {

    public static void open(String filename) {

	opencv_core.IplImage image = cvLoadImage(filename);
	if (image != null) {
	    cvShowImage(filename, image);
	    cvWaitKey();
	}
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
//	try {
//	    BufferedImage image = ImageIO.read(new File("D:\\aillen10.jpg"));
//	    BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
//	    BufferedImage newImage2 = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
//	    int white = new Color(255, 255, 255).getRGB();
//	    int black = new Color(0, 0, 0).getRGB();
//	    for (int x = 0; x < image.getWidth(); x++) {
//		for (int y = 0; y < image.getHeight(); y++) {
//		    Color color = new Color(image.getRGB(x, y));
//		    int red = color.getRed();
//		    int blue = color.getBlue();
//		    int green = color.getGreen();
//		    //int il = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));
//		    double porog = 0.5;
//		    double rand = Math.random();
//		    double rand2 = Math.random();
//		    if (rand > porog) {
//			if (rand2 > 0.5) {
//			    newImage.setRGB(x, y, white);
//			} else {
//			    newImage.setRGB(x, y, black);
//			}
//		    } else {
//			newImage.setRGB(x, y, image.getRGB(x, y));
//		    }
////                    int pop = new Color(il, il, il).getRGB();
////                    newImage.setRGB(x, y, pop);
////                    int porog = 150;
////
////                    if (il > porog) {
////                        pop = new Color(255, 255, 255).getRGB();
////                        newImage2.setRGB(x, y, pop);
////                    } else {
////                        pop = new Color(0, 0, 0).getRGB();
////                        newImage2.setRGB(x, y, pop);
////                    }
//		}
//	    }
//	    ImageIO.write(newImage, "png", new File("D:\\end.png"));
////            ImageIO.write(newImage2, "png", new File("D:\\binar.png"));
//	} catch (IOException e) {
//	    e.printStackTrace();
//	    System.out.println("Sorry, I cannot find that file.");
//	}

	       open("aillen10.jpg");
    }
}
