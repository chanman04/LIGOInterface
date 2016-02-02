package ligo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Kyle
 */
public class LIGO {

    private JButton button;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException{
        
        JPanel panel = new JPanel();
        URL url = new URL("https://media.giphy.com/media/KpBP8R8rBhwQ/giphy.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        JButton button = new JButton("Learn More");
        
        button.setBounds(60,400,220,30);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVisible(true);

        
        //panel.setBounds(1000, 8000, 200, 100);
        panel.add(button);
       
        JFrame f = new JFrame("Animation");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.add(panel);
        
        //f.setLocationRelativeTo(null);
        //f.add(new DrawStuff(), BorderLayout.CENTER);
    }    
}
