package ui;


import javax.swing.*;
import java.awt.*;

public class GraphicsTest extends JFrame {

    public GraphicsTest(){
        super("演示字体、颜色、绘图");
        setVisible ( true );
        setSize ( 480,250 );

    }

    public void paint(Graphics graphics){
        super.paint ( graphics );
        graphics.setFont ( new Font ( "SanSerif",Font.ITALIC,12 ) );
        graphics.setColor ( Color.blue );
        graphics.drawString ( "字体Serif,斜体,14号,红色",250,50 );
        graphics.setFont ( new Font ( "Serif",Font.ITALIC,14 ) );
        graphics.setColor ( new Color ( 255,0,0 ) );

        graphics.drawLine ( 20,60,460,60 );

        graphics.setColor ( Color.green );
        graphics.drawRect ( 20,70,100,50 );
        graphics.fillRect ( 130,70,40,100 );


    }

    public static void main (String[] args) {
        GraphicsTest app = new GraphicsTest ();
        app.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}
