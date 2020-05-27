package edu.xatu.imageReader;

public class JpgReaderFactory implements ImageReaderFactory {
    public ImageReader puduceImageReader () {
        System.out.println ("jpgreader...");
        return new JpgReader ();
    }
}
