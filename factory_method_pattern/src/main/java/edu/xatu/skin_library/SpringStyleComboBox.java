package edu.xatu.skin_library;

import javax.swing.*;
import java.awt.*;

public class SpringStyleComboBox extends JFrame implements ComboBox {
    public JComboBox jComboBox;

    public void display () {

        System.out.println ("SpringComboBox...");
        jComboBox = new JComboBox (  );
        jComboBox.setBorder ( BorderFactory.createLineBorder ( Color.GREEN ,5) );

        this.add ( jComboBox );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }
}
