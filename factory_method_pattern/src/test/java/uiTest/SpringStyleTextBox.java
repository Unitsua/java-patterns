package uiTest;

import edu.xatu.skin_library.TextBox;

import javax.swing.*;
import java.awt.*;

public class SpringStyleTextBox extends JFrame implements TextBox {

    JTextField jTextField;

    public void display () {
        System.out.println ("SpringTextBox...");

        jTextField = new JTextField ( "下笔如有神",20 );
        jTextField.setBorder ( BorderFactory.createLineBorder ( Color.GREEN,5 ) );

//        JPanel jPanel = new JPanel (  );
        this.add ( jTextField );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }

    public static void main (String[] args) {
        SpringStyleTextBox sstb = new SpringStyleTextBox ();
        sstb.display ();
    }
}
