package command;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ConcreteSubject implements Subject,Invoker {  //具体的被观察者

    private ArrayList<Observer> arrayList;


    public ConcreteSubject(){
        arrayList = new ArrayList <Observer> (  );
    }

    public void addObserver (Observer observer) {
        arrayList.add ( observer );
    }

    @Override
    public void deleteObserver (Observer observer) {
        arrayList.remove ( observer );
    }

    public void notifyObservers (int n, int x, int y) {
        for (Observer observer:arrayList){
            observer.update ( n,x,y );
        }
    }
}
