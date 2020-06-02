package command;

import javax.swing.*;

public class Client1 {
    public static void main (String[] args) {
        Receiver receiver = new Receiver ();
        System.out.println (receiver);
        ConcreteSubject concreteSubject = new ConcreteSubject ();
        System.out.println (concreteSubject);
        ConcreteCommand concreteCommand = new ConcreteCommand ( receiver,concreteSubject);
        System.out.println (concreteCommand);
        concreteCommand.excute ( new JPanel (  ),new Circle ( 20,20 ) );
    }
}
