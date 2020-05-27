package uiTest;

import edu.xatu.skin_library.ComboBox;

import javax.swing.*;
import java.awt.*;

public class SpringStyleComboBox extends JFrame implements ComboBox {

    public JComboBox jComboBox;

    public void display () {

        System.out.println ("SpringComboBox...");
        jComboBox = new JComboBox (  );
        jComboBox.setBorder ( BorderFactory.createLineBorder ( Color.GREEN ,5) );

//        JPanel jPanel = new JPanel (  );
        this.add ( jComboBox );
        this.setVisible ( true );
        this.setDefaultCloseOperation ( 3 );
        this.setSize ( 300,300 );
    }

    public static void main (String[] args) {
        SpringStyleComboBox sscb = new SpringStyleComboBox ();
        sscb.display ();
    }
}
