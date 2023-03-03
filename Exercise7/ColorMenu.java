package Exercise7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorMenu extends JFrame {
    
    JList colorList;
    private String[] colorNameArray = { "GRAY", "LIGHT GRAY", "WHITE", "BLACK" };
    private Color[] colorClassArray = { Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK };

    ColorMenu() {

        JLabel imageLabel = new JLabel();
        ImageIcon colorImage = new ImageIcon("color.jfif");
        imageLabel.setIcon(colorImage);
        this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("choose background color <3");
        label.setFont(new Font("Arial",Font.BOLD,25));
        this.add(label);

        colorList = new JList(colorNameArray);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial",Font.BOLD,25));

        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);
        this.add(colorList);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
    
}

    private class BGColorEventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
        GamePanel gp = new GamePanel();
        gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

        new GameFrame();

        dispose();
    }
}
}
