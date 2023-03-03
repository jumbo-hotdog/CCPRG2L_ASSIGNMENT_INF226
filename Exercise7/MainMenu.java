package Exercise7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame {

    MainMenu() {

        JLabel imageLabel = new JLabel();
        ImageIcon catImage = new ImageIcon("cat.gif");
        imageLabel.setIcon(catImage);
        this.add(imageLabel);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial",Font.BOLD,25));
        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
        
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            new ColorMenu();

            dispose();

        }
    }
}