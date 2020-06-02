package ui;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
import javax.swing.*;
 
public class T3 extends JFrame{
	
	private static final long serialVersionUID = 1L; 
	
	public T3() {
		setTitle("Hern");
		setBounds(400, 400, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel label = new JLabel();
		label.setText("请用鼠标点击");
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {//鼠标按键被释放时被触发
				// TODO Auto-generated method stub
				System.out.println("鼠标按键被释放，");
				int i = e.getButton(); //通过该值可以判断释放的是哪个键
				if (i == MouseEvent.BUTTON1) {
					System.out.print("释放了鼠标左键");
				}else if(i == MouseEvent.BUTTON2) {
					System.out.println("释放了鼠标滚轮");
				}else if(i == MouseEvent.BUTTON3){
					System.out.println("释放了鼠标右键");
				}
					
			}
			
			@Override
			public void mousePressed(MouseEvent e) {//鼠标按键被按下时被触发
				// TODO Auto-generated method stub
				System.out.print("鼠标按键被按下，");
				int i = e.getButton(); // 通过该值可以判断按下的是哪个键
				if(i == MouseEvent.BUTTON1) {
					System.out.print("按下了鼠标左键");
				}else if(i == MouseEvent.BUTTON2) {
					System.out.print("按下了鼠标滚轮");
				}else if(i == MouseEvent.BUTTON3) {
					System.out.print("按下了鼠标右键");
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {//光标移出组件时被触发
				// TODO Auto-generated method stub
				System.out.println("光标移除组件");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {//光标移入组件时被触发
				// TODO Auto-generated method stub
				System.out.println("光标移入组件");
 
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {//发生单击事件时被触发
				// TODO Auto-generated method stub
				System.out.print("单击了鼠标按键，");
				int i = e.getButton(); // 通过该值可以判断单击的是哪个键
				if (i == MouseEvent.BUTTON1) {
					label.setText (  "点击坐标为("+ e.getX () + "," + e.getY () + ")" );
					System.out.print("单击的是鼠标左键，");
				}else if (i == MouseEvent.BUTTON2) {
					System.out.print("单击的是鼠标滚轮，");
				}else if (i == MouseEvent.BUTTON3) {
					System.out.print("单击的是鼠标右键，");
				}
				int clickCount = e.getClickCount();//获取单击按键的次数
				System.out.println("单击次数为" + clickCount + "下");
			}
		});
		
		
		add(label);
		setVisible(true);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T3 test = new T3();

	}
 
}
