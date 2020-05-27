package edu.xatu.imageReader;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(){
        Object object = null;
        try {
            //创建文件对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance ();
            DocumentBuilder builder = dFactory.newDocumentBuilder ();
            Document doc;
            doc = builder.parse ( new File ( "src/main/resources/config.xml" ) );

            //获取包含类的本节点
            NodeList n1 = doc.getElementsByTagName ( "className" );
            Node classNode = n1.item ( 0 ).getFirstChild ();
            String cName = classNode.getNodeValue ();

            System.out.println (cName);

            Class c = Class.forName ( cName );
            Object obj = c.newInstance ();
            object = obj;
        }catch (Exception e){
            e.printStackTrace ();
        }
        return object;
    }
}
