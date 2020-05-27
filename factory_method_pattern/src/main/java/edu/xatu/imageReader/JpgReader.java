package edu.xatu.imageReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class JpgReader extends ImageFormat implements ImageReader {
    public void readImage () {
        //格式判断
        String path = "src\\main\\resources\\images\\jpg\\";
        String mid = null;
        Scanner sc = new Scanner ( System.in );
        System.out.print ("请输入图片名:");
        mid = sc.next ();
        String pathname = path + mid + ".jpg";
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
        System.out.println ("图片基本信息:"+image.getData ());
    }
}
