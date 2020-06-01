package iterator;

import java.util.ArrayList;

public class MyIteratorImpl implements MyIterator  {

    private int preIndex;
    private int nextIndex;
    private int currentIndex;
    private int lastIndex;
    private ArrayList<String> arrayList;


    public MyIteratorImpl ( int currentIndex, ArrayList<String> arrayList) {
        this.nextIndex = currentIndex ;
        this.currentIndex = currentIndex;
        this.lastIndex = arrayList.size () - 1 ;
        this.preIndex = lastIndex ;
        this.arrayList = arrayList;
    }


    public boolean hasPrevoius () {
        return preIndex-- != -1;
    }

    public String prevoius () {
        return arrayList.get ( lastIndex-- );
    }

    public boolean hasNext () {
        return nextIndex++ != arrayList.size ();
    }

    public String next () {
        return arrayList.get ( currentIndex++ );
    }


}
