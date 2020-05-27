package uiTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("计算器");

        f.setBounds(400, 200, 400, 300);
        //选择布局方式
        f.setLayout(new FlowLayout());

        //创建文本框
        final TextField tf = new TextField(20);

        //创建按钮
        Button bu = new Button("数据转移");

        //创建文本域
        final TextArea ta = new TextArea(10, 40);

        f.add(tf);
        f.add(bu);
        f.add(ta);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //给按钮添加实践
        bu.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                //获取文本框中的文本
                String tf_str = tf.getText().trim();
                tf.setText("");

                //将文本交给文本框
                //ta.setText(tf_str);
                //追加文本
                ta.append(tf_str+"\r\n");

                //将光标移动到tf文本框
                tf.requestFocus();
            }
        });

        //设置窗体显示
        f.setVisible(true);
    }
}