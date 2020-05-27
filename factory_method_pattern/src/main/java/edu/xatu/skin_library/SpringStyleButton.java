package edu.xatu.skin_library;

import javax.swing.*;
import java.awt.*;

public class SpringStyleButton extends JFrame implements Button {

    public JButton jButton;

    public void display () {
        System.out.println ("SpringButton...");

        JFrame jFrame = new JFrame ( "按钮" );

        jButton = new JButton ( "kick here" );
        jButton.setBackground ( Color.GREEN );

        JPanel jPanel = new JPanel (  );
        jPanel.add ( jButton );

        this.add ( jPanel );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }
}
