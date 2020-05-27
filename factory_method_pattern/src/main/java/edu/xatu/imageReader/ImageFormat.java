package edu.xatu.imageReader;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class  ImageFormat {

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
            ImageInputStream iis = ImageIO.createImageInputStream ( o );

            // Find all image readers that recognize the image format
            Iterator <javax.imageio.ImageReader> iter = ImageIO.getImageReaders ( iis );
            if (!iter.hasNext ()) {
                // No readers found
                return null;
            }

            // Use the first reader
            javax.imageio.ImageReader reader = (ImageReader) iter.next ();

            // Close stream
            iis.close ();

            // Return the format name
            return reader.getFormatName ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

        // The image could not be read
        return null;
    }
}
