package ui;

import command.Circle;
import command.Receiver;
import org.junit.Test;

import javax.swing.*;

public class TestUI {

    @Test
    public void test1(){
        Receiver r = new Receiver ();
        r.addSpot ( new JPanel (  ),new Circle (  ) );
    }
}
