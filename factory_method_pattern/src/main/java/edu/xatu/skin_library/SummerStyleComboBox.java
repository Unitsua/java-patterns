package edu.xatu.skin_library;

import javax.swing.*;
import java.awt.*;

public class SummerStyleComboBox extends JFrame implements ComboBox {

    public JComboBox jComboBox;

    public void display () {

        System.out.println ("SummerComboBox...");
        jComboBox = new JComboBox (  );
        jComboBox.setBorder ( BorderFactory.createLineBorder ( Color.GREEN ,5) );

        this.add ( jComboBox );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }
}
