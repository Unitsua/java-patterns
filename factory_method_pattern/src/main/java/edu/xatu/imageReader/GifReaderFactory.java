package edu.xatu.imageReader;

public class GifReaderFactory implements ImageReaderFactory {
    public ImageReader puduceImageReader () {
        System.out.println ("gifreader...");
        return new GifReader ();
    }
}
