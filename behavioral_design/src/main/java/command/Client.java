package command;

import javax.swing.*;

public class Client extends JFrame {

    Client(){
        Receiver receiver = new Receiver ();
        ConcreteSubject concreteSubject = new ConcreteSubject ();

        Command command = new ConcreteCommand ( receiver,concreteSubject );

        ConcreteInvoker concreteInvoker = new ConcreteInvoker (command,concreteSubject);

        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1 ();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2 ();

        concreteSubject.addObserver ( concreteObserver1 );
        concreteSubject.addObserver ( concreteObserver2 );

        this.add ( "North",concreteObserver1 );
        this.add ( "South",concreteObserver2 );
        this.add ( "Center",concreteInvoker );
        this.setSize ( 800,600 );
        this.setDefaultCloseOperation ( EXIT_ON_CLOSE );
        this.setVisible ( true );

    }

    public static void main (String[] args) {
        new Client ();
    }
}
