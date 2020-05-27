package imageTest;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class ImageTest3 {
    /**
     * 检查传入file的format名称
     * @param f 传入的文件
     * @return
     */
    public static String getFormatInFile(File f) {
        return getFormatName(f);
    }

    /**
     * 对文件进行format检索
     * .jpg .jpeg .jpe .jfif ===> JPEG
     * .png ===> png
     * .gif ===> gif
     * .
     * @param o
     * @return
     */
    // Returns the format name of the image in the object 'o'.
    // Returns null if the format is not known.
    private static String getFormatName(Object o) {
        try {
            // Create an image input stream on the image
            ImageInputStream iis = ImageIO.createImageInputStream(o);

            // Find all image readers that recognize the image format
            Iterator<ImageReader> iter = ImageIO.getImageReaders(iis);
            if (!iter.hasNext()) {
                // No readers found
                return null;
            }

            // Use the first reader
            ImageReader reader = (ImageReader) iter.next();

            // Close stream
            iis.close();

            // Return the format name
            return reader.getFormatName();
        } catch (IOException e) {
            e.printStackTrace ();
        }

        // The image could not be read
        return null;
    }

    public static void main (String[] args) {

        //格式判断
        String path = "src\\main\\resources\\images\\gif\\";

        String mid = null;
        Scanner sc = new Scanner ( System.in );
        System.out.print ("请输入图片名:");
        mid = sc.next ();
        String pathname = path + mid + ".gif";
        File file = new File ( pathname );
        Object formatName = getFormatInFile ( file );
        System.out.println (formatName);

        //读取图片信息
        BufferedImage image = null;
        try {
            image = ImageIO.read(new FileInputStream (pathname));
        } catch (IOException e) {
            e.printStackTrace ();
        }
        System.out.println (image.getData ());
    }
}
