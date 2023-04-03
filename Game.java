import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Game extends JPanel implements ActionListener {
    public static void main(String[] args) {
        JFrame window = new JFrame("GREEDY FISH");
        Gamepanel game = new Gamepanel();
        JPanel startpage = new JPanel();
        JButton button = new JButton("START");
        Color bg = new Color(200, 200, 200);

        window.setSize(550,500);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.add(new Gamepanel());
        window.add(game);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        game.setVisible(false);
        window.add(startpage);
        
        
        startpage.setLayout(new BorderLayout());
        startpage.add(button, BorderLayout.SOUTH);
        startpage.setVisible(true);
        button.setForeground(Color.white);
        button.setBackground(bg);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setVisible(false);
                startpage.setVisible(false);
                game.setVisible(true);
            }
        });
    }
    }