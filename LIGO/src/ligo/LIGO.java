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
 * @author Danny Truong, Kyle Martinez, Michael Chan
 */
public class LIGO {
    
    
    public static void main(String[] args) throws MalformedURLException{
        
        JPanel panel = new JPanel();
        URL url = new URL("https://media.giphy.com/media/KpBP8R8rBhwQ/giphy.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
        
        JButton LearnMoreButton = new JButton( new ImageIcon("Images/learn_more_button.jpg"));
        //LearnMoreButton.setBounds(600,400,220,600);
        LearnMoreButton.setHorizontalTextPosition(SwingConstants.CENTER);
        LearnMoreButton.setVerticalTextPosition(SwingConstants.CENTER);
        LearnMoreButton.setVisible(true);
        

        
        //panel.setBounds(1000, 8000, 200, 100);
        panel.add(LearnMoreButton);
       
        JFrame frame = new JFrame("Animation");
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(panel);
        
        //f.setLocationRelativeTo(null);
        //f.add(new DrawStuff(), BorderLayout.CENTER);
    }    
}
