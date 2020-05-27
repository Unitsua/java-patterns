package uiTest;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Test extends JFrame implements ActionListener{
    JPanel panel   =new JPanel();
    JButton b1     =new JButton("1");
    JButton b2     =new JButton("2");
    JButton b3     =new JButton(".");
    JLabel  lbl    =new JLabel("我是标签");
    JTextField txt =new JTextField("",10);
    public Test(){
        this.setLayout(new FlowLayout());
        panel.add(b1);panel.add(b2);panel.add(b3);panel.add(lbl);panel.add(txt);
        this.add(panel);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.setSize(400,260);
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        txt.setText( txt.getText() + ae.getActionCommand() );
    }
}