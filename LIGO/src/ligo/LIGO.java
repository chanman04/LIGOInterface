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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Kyle
 */
public class LIGO extends JPanel{
    
    private final Image image;

    public LIGO(Image image) {
        super();
        this.image = image;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0, getWidth(), getHeight(), this);
    }
    
    public static void main(String[] args) throws MalformedURLException{
      
        final URL url = new URL("https://media.giphy.com/media/KpBP8R8rBhwQ/giphy.gif");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame("Image");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLocationByPlatform(true);

                Image image = f.getToolkit().createImage(url);
                LIGO imagePanel = new LIGO(image);
                JButton button = new JButton("Learn More");
                imagePanel.add(button);

                f.setContentPane(imagePanel);
                f.pack();
                f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                f.setBounds(0,0,1800, 1000);
                f.setVisible(true);
                
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //dispose();
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                f.dispose();
                                new Main_Menu().setVisible(true);
                            }
                        });
                    }
                });
            }
        });
    }
}
