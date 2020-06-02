package command;

import javax.swing.*;
import java.util.ArrayList;

public class ConcreteCommand implements Command {

    private Receiver receiver;
    private ArrayList<Circle> arrayList;
    private Invoker invoker;

    public ConcreteCommand (Receiver receiver, Invoker invoker) {
        this.receiver = receiver;
        this.arrayList = new ArrayList <Circle> (  );
        this.invoker = invoker;
    }


    public void excute (JPanel jPanel, Circle circle) {
        receiver.addSpot ( jPanel,circle );
        arrayList.add ( circle );
    }

    public void undo (JPanel jPanel) {
        Circle circle;

        if (arrayList.size () >= 1){
            circle = arrayList.get ( arrayList.size () - 1 );
            receiver.deleteSpot ( jPanel,circle );
            arrayList.remove ( arrayList.size () - 1 );
            int n = 2;
            invoker.notifyObservers ( n,circle.getX (),circle.getY () );
        }
    }

}
