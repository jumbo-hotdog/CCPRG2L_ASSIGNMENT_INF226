package Exercise7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TryAgain extends JFrame {

    TryAgain() {

        JLabel imageLabel = new JLabel();
        ImageIcon overImage = new ImageIcon("youlose.jfif");
        imageLabel.setIcon(overImage);
        this.add(imageLabel);

        JLabel gameOver = new JLabel();
        gameOver.setText("emag revo mhie");
        gameOver.setFont(new Font("Arial",Font.BOLD,50));
        this.add(gameOver);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial",Font.BOLD,25));
        TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(tryHandler);

        JButton exit = new JButton();
        exit.setText("Exit");
        exit.setFont(new Font("Arial",Font.BOLD,25));
        ExitEventHandler exitHandler = new ExitEventHandler();
        exit.addActionListener(exitHandler);

        this.add(tryAgainButton);
        this.add(exit);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
        
    }

    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            App.main(null);
            dispose();
        }
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
}
    
    

