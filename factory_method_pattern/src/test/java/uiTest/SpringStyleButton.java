package uiTest;

import edu.xatu.skin_library.Button;

import javax.swing.*;
import java.awt.*;

public class SpringStyleButton extends JFrame implements Button {

    JButton jButton,jButton2;
    public void display () {
        System.out.println ("SpringButton...");

        jButton = new JButton ( "kick me" );
        jButton2 = new JButton ( "kick here" );
        jButton.setBackground ( Color.GREEN );
        jButton2.setBackground ( Color.green );

        JPanel jPanel = new JPanel (  );
        jPanel.add ( jButton );
        jPanel.add ( jButton2 );

        this.add ( jPanel );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );

    }

    public static void main (String[] args) {
        SpringStyleButton ssb = new SpringStyleButton ();
        ssb.display ();
    }
}
