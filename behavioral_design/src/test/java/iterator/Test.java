package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main (String[] args) {
        ArrayList<String> str = new ArrayList <String> (  );
        str.add ( "dc" );
        str.add ( "伊利" );
        str.add ( "蒙牛" );
        str.add ( "哇哈哈" );
        str.add ( "安慕希" );

        System.out.println ("顺序输出:");
        MyIterator myIterator = new MyIteratorImpl ( 0,str );
        while (myIterator.hasNext ()){
            System.out.print (myIterator.next () + " ");
        }

        System.out.println ("\n倒叙输出:");
        while (myIterator.hasPrevoius ()){
            System.out.print (myIterator.prevoius () + " ");
        }



    }

}



