package edu.xatu.imageReader;

public class Client {

    public static void main (String[] args) {
        try {
            ImageReaderFactory factory;
            ImageReader imageReader;
            factory = (ImageReaderFactory) XMLUtil.getBean ();
            imageReader = factory.puduceImageReader ();
            imageReader.readImage ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

}
