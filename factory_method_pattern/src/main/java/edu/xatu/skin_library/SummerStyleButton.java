package edu.xatu.skin_library;

import javax.swing.*;
import java.awt.*;

public class SummerStyleButton extends JFrame implements Button {
    public JButton jButton;

    public void display () {
        System.out.println ("SummerButton...");
        JFrame jFrame = new JFrame ( "按钮" );
        jButton = new JButton ( "kick here" );
        jButton.setBackground ( Color.CYAN );

        JPanel jPanel = new JPanel (  );
        jPanel.add ( jButton );

        this.add ( jPanel );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }
}
