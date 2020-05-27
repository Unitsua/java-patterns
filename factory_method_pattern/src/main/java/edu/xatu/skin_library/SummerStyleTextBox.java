package edu.xatu.skin_library;

import javax.swing.*;
import java.awt.*;

public class SummerStyleTextBox extends JFrame implements TextBox {

    JTextField jTextField;

    public void display () {
        System.out.println ("SummerTextBox...");

        jTextField = new JTextField ( "下笔如有神",20 );
        jTextField.setBorder ( BorderFactory.createLineBorder ( Color.BLUE,5 ) );

        this.add ( jTextField );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }
}
