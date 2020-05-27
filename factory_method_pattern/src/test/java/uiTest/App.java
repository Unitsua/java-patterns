package uiTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class App extends JFrame {
     
    private JComboBox<String> cbxColors;
     
    private JTextField txtName;
     
    private Map<String, Color> colorMap;
     
    public App() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
         
        colorMap = new HashMap<>();
        colorMap.put("红", Color.RED);
        colorMap.put("绿", Color.GREEN);
        colorMap.put("蓝", Color.BLUE);
        colorMap.put("黄", Color.YELLOW);
         
         
        cbxColors = new JComboBox(colorMap.keySet().toArray());
        cbxColors.setPreferredSize(new Dimension(50, 23));
        cbxColors.addItemListener(e -> {
            Color color = colorMap.get(e.getItem());
            txtName.setBackground(color);
        });
        this.add(cbxColors);
         
        txtName = new JTextField();
        txtName.setBorder ( BorderFactory.createLineBorder ( Color.GREEN,5 ) );
        txtName.setPreferredSize(new Dimension(100, 23));
        txtName.setBackground(Color.RED);
        this.add(txtName);
    }
     
    public static void main(String[] args) {
        new App().setVisible(true);
    }
}