package uiTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.*;
 
public class Shi extends JFrame implements ActionListener {
    // 实现的点击按钮
 
    JButton jb, jb2;
 
    public Shi() {

        jb = new JButton("确定吗");
        jb2 = new JButton("是的吗");
        jb2.setBackground(Color.yellow);//
        jb.setBackground(Color.red);
        JPanel jp = new JPanel();
        jp.add(jb);
        jp.add(jb2);
        this.add(jp);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setSize(500, 500);
 
        // 需要对按钮就行监听
        jb.addActionListener(this);// 这里需要指的是当前类
 
    }
 
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb) {
            jb.setBackground(Color.blue);// 蓝色
        } else if (e.getSource() == jb2) {
            jb2.setBackground(Color.red);//
        }
    }
 
    public static void main(String[] args) {
        new Shi();
    }
}