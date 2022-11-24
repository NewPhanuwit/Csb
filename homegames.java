
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class homegames extends JPanel{
        private ImageIcon bg = new ImageIcon(this.getClass().getResource("bg.png"));
        private ImageIcon start = new ImageIcon(this.getClass().getResource("Start.png"));
        private ImageIcon exit = new ImageIcon(this.getClass().getResource("Exitmenu.png"));
        private ImageIcon tip = new ImageIcon(this.getClass().getResource("TipMenu.png"));
        private ImageIcon boxmenu = new ImageIcon(this.getClass().getResource("boxmenu.png"));
        private ImageIcon csb = new ImageIcon(this.getClass().getResource("CsbLogo.png"));
        public JButton BStart = new JButton(start);
        public JButton BExit = new JButton(exit);
        public JButton BTips = new JButton(tip);
    
        homegames()
        {
            int t=50;
    
            setLayout(null);
            BExit.setBounds(140,573-t,341,80);
            BExit.setOpaque(false);
            BExit.setContentAreaFilled(false);
            BExit.setBorderPainted(false);
            add(BExit);
            BStart.setBounds(140,322-t,341,80);
            BStart.setOpaque(false);
            BStart.setContentAreaFilled(false);
            BStart.setBorderPainted(false);
            add(BStart);
            BTips.setBounds(140,450-t,341,80);
            BTips.setOpaque(false);
            BTips.setContentAreaFilled(false);
            BTips.setBorderPainted(false);
            add(BTips);
            
            
        }   
    
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(bg.getImage(),0,0,1400,800,this);
            g.drawImage(boxmenu.getImage(), 40, 120, 579, 595, this);
            g.drawImage(csb.getImage(), 142, 22, 378, 252, this);
            g.setColor(Color.black);
        }
    }
    